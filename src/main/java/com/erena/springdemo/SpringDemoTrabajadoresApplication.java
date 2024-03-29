package com.erena.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringDemoTrabajadoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoTrabajadoresApplication.class, args);
	}

}
