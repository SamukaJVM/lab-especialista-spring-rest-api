package com.modulo01.aula05.config;

import com.modulo01.aula05.notificacao.NotificadorEmail;
import com.modulo01.aula05.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration /* Indicar que são fontes de definições de beans para container IoC */
public class AlgaConfigGenerica {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		System.out.println("Sendo visto pelo spring");
		return notificador;
	}

	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
