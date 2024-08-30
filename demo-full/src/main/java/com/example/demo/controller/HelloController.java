package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
//build.gradle implementation 'org.springframework.boot:spring-boot-starter-web' 없으면 controller어노테이션 불가
@RestController
public class HelloController {
	@GetMapping("/api/hello")
	public String isayHello() {
		return "안녕하세요. 스프링부트입니다";
	}
}