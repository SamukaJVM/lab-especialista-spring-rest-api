package com.modulo01.aula05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula05")
public class MainAula05 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula05.class, args);
		/* 05 - Usando @Configuration e @Bean para definir beans
		* Anotando com @Configuration + @Bean na Classe NotificacaoConfig
		* Anotando com @Configuration + @Bean na Classe ServiceConfig
		*/
	}

}
