package com.modulo01.aula03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula03")
public class MainAula03 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula03.class, args);
		/* 03 - Definindo beans com @Component */
		/* Definindo beans gerenciados anotando com @Component */
	}

}
