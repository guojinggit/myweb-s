package host.guojing.web.service;

import host.guojing.web.common.PageParam;
import host.guojing.web.dao.ITableIpDao;
import host.guojing.web.entity.TableIp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TableIpService {

	@Resource
	ITableIpDao dao ;
	
	public int getRowCount() {
		return dao.getRowCount();
	}

	public PageParam getIpListByPage(PageParam pageParam) {
		int currPage = pageParam.getCurrPage();
		// limit offset, size
		int offset = (currPage - 1) * PageParam.pageSize ;
		int size = PageParam.pageSize;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("offset", offset);
		params.put("size", size);
		
		List<TableIp> ipList = dao.selectByParams(params);
		pageParam.setData(ipList);
		
		return pageParam;
	}

	public String printIp(String number, String country, String isp) {
		int size = 100;
		try {
			size = Integer.parseInt(number);
		} catch (Exception e) {
		}
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("size", size);
		params.put("country", country);
		params.put("isp", isp);
		
		List<TableIp> ipList = dao.fetchByParams(params);
		StringBuilder sBuilder = new StringBuilder();
		for (TableIp tableIp : ipList) {
			sBuilder.append(tableIp.getIp()).append(":").append(tableIp.getPort()).append(",").append(tableIp.getCountry()).append(",").append(tableIp.getIsp());
			sBuilder.append("\r\n");
		}
		
		return sBuilder.toString();
	}


}

