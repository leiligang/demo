package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	public String test(String message) {
		return "你好，" + message;
	}
}
