package host.guojing.web.controller;

import host.guojing.web.entity.BlogTitle;
import host.guojing.web.service.BlogListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/15.
 */
@Controller
public class StoryListController {

    @Resource
    BlogListService blogListService;

    @RequestMapping("storylist")
    public String getBlogList(HttpServletRequest request){
        System.out.println("coming");
        List<String> strList = new ArrayList<String>();
        strList.add("mystory_2016");
        strList.add("mystory_2017");
        for (String table_name : strList){
            List<BlogTitle> titleList = blogListService.getBlogList(table_name);
            //处理一下时间的格式
            for(BlogTitle title : titleList){
                String date = title.getBlogdate();
                String year = date.substring(0,4);
                String month = date.substring(4,6);
                String day = date.substring(6,8);
                title.setBlogdate(year + "-" + month + "-" + day);
            }
            request.setAttribute(table_name, titleList);
        }

        return "/WEB-INF/jsp/story/storyList.jsp";
    }
}
