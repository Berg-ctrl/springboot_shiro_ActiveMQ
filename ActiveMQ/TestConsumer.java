package com.itheima.ActiveMQ;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class TestConsumer {
	//监听消费
	//@JmsListener(destination="ay.queue")
	public void receiveQqueue(String text)
	{
		System.out.print("用户发表"+text+"成功");
	}
}