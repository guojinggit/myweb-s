package host.guojing.web.controller;

import host.guojing.web.common.PageParam;
import host.guojing.web.service.TableIpService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

	@Resource
    TableIpService service;
	
	//@RequestMapping(value = "index")
	public String helloWorld(HttpServletRequest request){
		String currPageStr = request.getParameter("page");
		int currPage = 1;
		try {
			currPage = Integer.parseInt(currPageStr);
		} catch (Exception e) {
		}

		// 获取总记录数
		int rowCount = service.getRowCount();
		PageParam pageParam = new PageParam();
		pageParam.setRowCount(rowCount);
		if (pageParam.getTotalPage() < currPage) {
			currPage = pageParam.getTotalPage();
		}
		pageParam.setCurrPage(currPage);
		pageParam = service.getIpListByPage(pageParam);

		request.setAttribute("pageParam", pageParam);
        System.out.println("coming");
		return "/index.jsp";
	}

}
