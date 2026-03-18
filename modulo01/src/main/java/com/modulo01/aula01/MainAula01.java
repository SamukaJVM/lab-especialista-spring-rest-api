package com.modulo01.aula01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula01")
public class MainAula01 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula01.class, args);
		/* Criando um controller com Spring MVC */
	}

}
