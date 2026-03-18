package com.modulo01.aula01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula01")
public class Modulo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Modulo01Application.class, args);
		/* Criando um controller com Spring MVC */
	}

}
