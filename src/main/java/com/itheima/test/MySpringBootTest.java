package com.itheima.test;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.springframework.data.redis.connection.StringRedisConnection;

import redis.clients.jedis.Jedis;

public class MySpringBootTest {
	//redis测试
	//@Test
	public void testJedis()
	{
		Jedis jedis = new Jedis("localhost");
        //jedis.set("a", "a");
        String value = jedis.get("a");
        System.out.println(value);
	}

}
