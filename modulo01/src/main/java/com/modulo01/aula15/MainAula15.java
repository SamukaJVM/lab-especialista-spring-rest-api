package com.modulo01.aula15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula15")
public class MainAula15 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula15.class, args);
		/* 15 - Criando e acessando propriedades customizadas com @Value
		* Criar uma propriedade customizada no application.properties
		* Anotando Classe de NotificadorEmail com @Value para acessar as propriedades customizadas
		*/

	}

}
