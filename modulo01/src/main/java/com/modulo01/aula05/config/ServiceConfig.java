package com.modulo01.aula05.config;

import com.modulo01.aula05.notificacao.Notificador;
import com.modulo01.aula05.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* Indicar é definições de beans para container IoC */
public class ServiceConfig {

	@Bean /* Indica ao Spring que o metodo anotado retornará um objeto "bean" */
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		System.out.println("Anotandom com @Configuration + @Bean no AtivacaoClienteService");
		return new AtivacaoClienteService(notificador);
	}
	
}
