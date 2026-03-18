package com.modulo01.aula02.service;

import com.modulo01.aula02.modelo.Cliente;
import com.modulo01.aula02.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;

	/* injeção de dependências Motificador de forma manual */
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
