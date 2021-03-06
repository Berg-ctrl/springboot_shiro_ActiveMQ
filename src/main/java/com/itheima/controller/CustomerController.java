package com.itheima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("findList")
	public String findList(Model model){
		List list=customerService.findList();
		System.out.print(list.get(0).toString());
		model.addAttribute("list",list);
		return "list";
		
	}
}
