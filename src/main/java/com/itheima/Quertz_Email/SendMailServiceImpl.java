package com.itheima.Quertz_Email;

import java.util.List;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.itheima.domain.Customer;
@Service
public class SendMailServiceImpl implements SendMailService{
	@Autowired
	JavaMailSender mailSender;
	public boolean sendMail() {
		MimeMessage mimeMessage=this.mailSender.createMimeMessage();
		MimeMessageHelper message=new MimeMessageHelper(mimeMessage);
		try {
			message.setFrom("752987310@qq.com");
			message.setSubject("早上好，吃饭了吗");
			message.setTo("1094117036@qq.com");
			message.setText("今天早上吃了什么好吃的");
			this.mailSender.send(mimeMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Boolean.TRUE;
	}
	

}
