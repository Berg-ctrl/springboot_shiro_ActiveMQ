package com.itheima.Quertz_Email;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class SendMailQuartz {
	@Resource
	private SendMailService sendMailService;
	//@Scheduled(cron="*/5 * * * * *")
	public void reportCurrentByCron()
	{
		System.out.print("定时器运行了。。");
		sendMailService.sendMail();
	}
}
