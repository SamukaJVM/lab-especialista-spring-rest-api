package com.modulo01.aula09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula09")
public class MainAula09 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula09.class, args);
		/* 09 - Desambiguação de beans com @Primary
		* Fazendo a Desambiguação usando a anotação @Primary na Classe NotificadorEmail
		*/


	}

}
