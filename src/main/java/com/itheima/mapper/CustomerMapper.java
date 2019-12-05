package com.itheima.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.itheima.domain.Customer;
@Component
public interface CustomerMapper {

	public List<Customer> findList();

}
