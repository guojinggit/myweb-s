package host.guojing.web.controller;

import host.guojing.web.entity.BlogTitle;
import host.guojing.web.service.BlogListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/1/15.
 */
@Controller
public class BlogListController {

    @Resource
    BlogListService blogListService;

    @RequestMapping("bloglist")
    public String getBlogList(HttpServletRequest request){
        System.out.println("coming");
        List<BlogTitle> titleList = blogListService.getBlogList();
        System.out.println(titleList.get(0).getTitle());
        System.out.println(titleList.size());
        request.setAttribute("blogTitleList", titleList);
        request.setAttribute("test", "testttt");
        return "jsp/blog/bloglist.jsp";
    }
}
