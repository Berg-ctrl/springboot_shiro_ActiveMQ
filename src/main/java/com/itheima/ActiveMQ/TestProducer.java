package com.itheima.ActiveMQ;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class TestProducer {
	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;
	Destination destination=new ActiveMQQueue("ay.queue");
	//每5秒执行一次
	//@Scheduled(fixedDelay = 5000)
	public void sendMessage()
	{
		//0. 先判断端口是否启动了  Active MQ 服务器
	    ActiveMQUtil.checkServer();
		jmsMessagingTemplate.convertAndSend(destination,"hello,mq");
	}
    
}