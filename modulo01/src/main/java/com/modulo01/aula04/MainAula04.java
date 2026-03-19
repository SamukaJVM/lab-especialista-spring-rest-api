package com.modulo01.aula04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula04")
public class MainAula04 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula04.class, args);
		/* 04 - Injetando dependências (beans Spring)
			1º Spring Instanciou Bean da Classe NotificadorEmail
			2º Spring Instanciou o Bean da Classe AtivacaoClienteService
			3º Spring Injetando o Bean notificador na AtivacaoClienteService
			4º Spring Injetando o Bean(ativacaoClienteService) no MeuController
		 */
	}

}
