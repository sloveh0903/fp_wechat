package cn.sun.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@RequestMapping("/test")
	public void test() {
		System.out.println("hello xiaoming");
	}
	
}
