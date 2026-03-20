package com.modulo01.aula11.service;

import com.modulo01.aula11.modelo.Cliente;
import com.modulo01.aula11.notificacao.NivelUrgencia;
import com.modulo01.aula11.notificacao.Notificador;
import com.modulo01.aula11.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
