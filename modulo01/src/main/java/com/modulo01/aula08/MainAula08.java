package com.modulo01.aula08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula08")
public class MainAula08 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula08.class, args);
		/* 08 - Ambiguidade de beans e injeção de lista de beans
		* A Classe AtivacaoClienteService tem uma injeção de dependência do tipo Notificador,
		* mas existem 2 implementações dessa interface: NotificadorEmail e NotificadorSMS
		* O Spring não sabe qual implementação injetar, resultando em uma ambiguidade de beans;
		* Para ambiguidades usar List<Notificador> notificadores e iterar com for sobre a lista para chamar o metodo notificar
		*/


	}

}
