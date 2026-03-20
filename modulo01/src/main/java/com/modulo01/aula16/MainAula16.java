package com.modulo01.aula16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula16")
public class MainAula16 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula16.class, args);
		/* 16 - Acessando propriedades com @ConfigurationProperties
		 * Criar a classe NotificadorProperties,
		 * Anotar a classe com @ConfigurationProperties("notificador.email") e @Component
		 * Criar os atributos hostServidor e portaServidor, com seus getters e setters
		 * Injetar a classe NotificadorProperties no NotificadorEmail
		 * Imprimir os valores das propriedades no metodo notificar do NotificadorEmail
		 */

	}

}
