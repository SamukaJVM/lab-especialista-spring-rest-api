package com.modulo01.aula11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula11")
public class MainAula11 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula11.class, args);
		/* 11 - Desambiquação de beans com anotação customizada
		 * Criar uma anotação customizada @TipoDoNotificador que recebe um valor do enum NivelUrgencia
		 * Anotar as classes NotificadorEmail e NotificadorSMS com @TipoDoNotificador,
		 * passando o nível de urgência correspondente Na classe AtivacaoClienteService,
		 * injetar o Notificador utilizando a anotação @TipoDoNotificador, passando o nível de urgência desejado
		 * Testar a aplicação para verificar se o Notificador correto é injetado com base no nível de urgência especificado,
		 * e se a notificação é enviada corretamente para o cliente.
		 */


	}

}
