package com.itheima.service.impl;

import java.util.ArrayList;
import java.util.List;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.domain.Customer;
import com.itheima.mapper.CustomerMapper;
import com.itheima.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerMapper customerMapper;
	
	//@Resource
	//private RedisTemplate redisTemplate;
	//private String allCustomer = "allCustomer";
	@Override
	public List<Customer> findList() {
		// TODO Auto-generated method stub
		return customerMapper.findList();
	}

//	@Override
//	public List<Customer> findList() {
//		// TODO Auto-generated method stub
//		//List<Customer> list=redisTemplate.opsForList().range(allCustomer, 0, -1);
//		List list=null;
//		return list;
//	}
	

	
}
