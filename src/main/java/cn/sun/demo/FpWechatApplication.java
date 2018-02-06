package cn.sun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FpWechatApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(FpWechatApplication.class, args);
	}
}
