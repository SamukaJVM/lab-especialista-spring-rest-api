package com.modulo01.aula10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula10")
public class MainAula10 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula10.class, args);
		/* 10 - Desambiguação de beans com @Qualifier
		* Fazendo a Desambiguação usando a anotação @Qualifier nas classes NotificadorEmail e NotificadorSMS,
		* e também na classe AtivacaoClienteService, onde o bean é injetado.
		* O @Qualifier é usado para indicar qual bean deve ser injetado quando há mais de um candidato do mesmo tipo.
		* No exemplo, o NotificadorEmail tem o @Qualifier("normal") e o NotificadorSMS tem o @Qualifier("urgente").
		* Na classe AtivacaoClienteService, o campo notificador é anotado com @Qualifier("urgente"), indicando que o bean NotificadorSMS deve ser injetado.
		* Assim, quando a aplicação for executada e a rota /hello for acessada, o cliente João será ativado e receberá uma notificação por SMS, conforme definido no NotificadorSMS.
		* Se quisermos usar o NotificadorEmail, basta mudar o @Qualifier para "normal" na classe AtivacaoClienteService.
		* Dessa forma, conseguimos resolver a ambiguidade entre os dois beans do tipo Notificador e garantir que o comportamento desejado seja alcançado.
		*/


	}

}
