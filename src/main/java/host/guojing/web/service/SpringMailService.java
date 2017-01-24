package host.guojing.web.service;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;


public class SpringMailService  {

    
    private JavaMailSender mailSender;
    private VelocityEngine velocityEngine;
    private SimpleMailMessage simpleMailMessage;
    
  //使用JavaMail的MimeMessage，支付更加复杂的邮件格式和内容  
   
    //创建MimeMessageHelper对象，处理MimeMessage的辅助类  
    
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }
    public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
       // this.simpleMailMessage = simpleMailMessage;
    }

    public void sendText(String text, String to) throws MessagingException {
        MimeMessage msg = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);
        helper.setTo(to);
        helper.setFrom("2407994832@qq.com");
        try {
            helper.setText(text, true);
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mailSender.send(msg);
    }

    public void sendSimpleText(String subject, String to, Map data) throws MessagingException {
        String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, "fawen.vm", "UTF-8",data);
        MimeMessage msg = mailSender.createMimeMessage();  
        MimeMessageHelper helper = new MimeMessageHelper(msg);  
        helper.setTo(to);
        helper.setSubject(subject);
        try {
			helper.setText(text, true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        mailSender.send(msg);
    }

    public void sendMineMessage(String subject,String[] to,String templateName,Map data) throws Exception {
            String text = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateName, "UTF-8",data);
            MimeMessage  mimeMessage =  mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper  = new MimeMessageHelper(mimeMessage,true,"UTF-8");
            mimeMessageHelper.setTo(to);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setFrom("yyent-quality-monitor@yy.com");
            mimeMessageHelper.setText(text, true);
            mailSender.send(mimeMessage);
    }
}
