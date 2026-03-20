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
		* Fazendo a Desambiguação usando a anotação @Primary na Classe NotificadorEmail,
		* indicando que esse bean deve ser o preferencial quando houver mais de um candidato do mesmo tipo.
		* No exemplo, o NotificadorEmail é anotado com @Primary, o que significa que ele será o bean preferencial
		* para injeção quando houver mais de um bean do tipo Notificador.
		* Assim, quando a aplicação for executada e a rota /hello for acessada, o cliente João será ativado
		* e receberá uma notificação por e-mail, conforme definido no NotificadorEmail.
		*/


	}

}
