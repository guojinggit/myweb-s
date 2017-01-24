package host.guojing.web.controller;

import host.guojing.web.service.SpringMailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

/**
 *Created by Administrator on 2017/1/24.
 */
@Controller
public class MailController {

    @Resource
    SpringMailService springMailService;
    @RequestMapping("mail")
    public String sendMail(HttpServletRequest request) {
        String mailcontext = request.getParameter("mailcontext");
        System.out.println(mailcontext);
        String someone = request.getParameter("someone");
        System.out.println(someone);
        try {
            springMailService.sendText(mailcontext + "    from:" + someone, "495389585@qq.com");
        } catch (MessagingException e) {
            e.printStackTrace();
            String mailStat = "邮件投递失败，稍后我会及时处理";
            request.setAttribute("mailStat" , mailStat);
            return "/mail.jsp";
        }
        String mailStat = "";
        if (someone.equals("") || someone==null){
            mailStat = "邮件投递成功,未留下收件箱，邮件将无法回复!";
        } else{
            mailStat = "邮件投递成功，稍后我可能会及时回复! To:" + someone;
        }
        request.setAttribute("mailStat", mailStat);
        return "/mail.jsp";
    }
}
