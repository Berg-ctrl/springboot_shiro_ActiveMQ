package com.itheima.test;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import redis.clients.jedis.Jedis;
@WebListener
public class listenerTest implements ServletContextListener{
	Logger logger=LogManager.getLogger(this.getClass());
	//@Resource
	//private RedisTemplate redisTemplate;
	//@Autowired
	//private CustomerService customerService;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("上下文销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		//从数据库中取出customer列表放入redis缓存
		//List<Customer> list=customerService.findList();
		//String allCustomer="allCustomer";
		//redisTemplate.delete(allCustomer);
		//redisTemplate.opsForList().leftPushAll(allCustomer, list);
		//List<Customer> querylist=redisTemplate.opsForList().range(allCustomer, 0, -1);
		//logger.info("目前缓存中有"+querylist.size()+"人");
	}
	

}
