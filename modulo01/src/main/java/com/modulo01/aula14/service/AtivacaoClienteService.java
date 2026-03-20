package com.modulo01.aula14.service;

import com.modulo01.aula14.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	// 2. Disparando o evento
	public void ativar(Cliente cliente) {
		cliente.ativar();
		// Aqui o evento é instanciado e lançado para o contexto do Spring
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}
