package com.modulo01.aula12.service;

import com.modulo01.aula12.modelo.Cliente;
import com.modulo01.aula12.notificacao.NivelUrgencia;
import com.modulo01.aula12.notificacao.Notificador;
import com.modulo01.aula12.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
