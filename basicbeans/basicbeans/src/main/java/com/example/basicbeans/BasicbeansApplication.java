package com.example.basicbeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicbeansApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(BasicbeansApplication.class, args);
	for(String s : apc.getBeanDefinitionNames())
		System.out.println(s);
	}

}
