package com.zipkin.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	//测试用户api接口
	@GetMapping("/hi")
	public String hi(){
		return "i am user";
	}
}
