package host.guojing.web.controller;

import host.guojing.web.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/1/23.
 */

@Controller
public class StoryController {

    @Resource
    BlogService blogService;

    @RequestMapping("story")
    public String getBlog(HttpServletRequest request){
        String id = request.getParameter("id");
        String table_name = request.getParameter("name");
        table_name = "mystory_" + table_name;

        String blog = blogService.getBlog(table_name, Integer.parseInt(id));
        request.setAttribute("blog", blog);
        return "/WEB-INF/jsp/story/story.jsp";
    }
}
