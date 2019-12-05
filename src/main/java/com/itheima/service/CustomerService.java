package com.itheima.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.itheima.domain.Customer;
public interface CustomerService {
	public List<Customer> findList();
}
