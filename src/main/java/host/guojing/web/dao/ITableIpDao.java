package host.guojing.web.dao;

import host.guojing.web.entity.TableIp;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ITableIpDao {

	int getRowCount();

	List<TableIp> selectByParams(Map<String, Object> params);

	List<TableIp> fetchByParams(Map<String, Object> params);

}
