package com.modulo01.aula05.config;

import com.modulo01.aula05.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* Indicar é definições de beans para container IoC */
public class NotificacaoConfig {

	@Bean /* Indica ao Spring que o metodo anotado retornará um objeto "bean" */
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		System.out.println("Anotandom com @Configuration + @Bean no notificadorEmail");
		return notificador;
	}
	
}
