package com.cjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.cjp.service.UserService;

@Controller
public class UserController {
	@Autowired(required=false)
	@Qualifier("类名")
	private UserService userService;
	public void add(){
		userService.add();
	}
	@Autowired
	public void setUserService(@Qualifier("类名") UserService userService) {
		this.userService = userService;
	}
	
	

}
