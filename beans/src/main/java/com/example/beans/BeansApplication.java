package com.example.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(BeansApplication.class, args);
		for(String s : apc.getBeanDefinitionNames())
			System.out.println(s);
	}
	}

}
