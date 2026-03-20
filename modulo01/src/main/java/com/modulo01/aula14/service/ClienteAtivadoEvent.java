package com.modulo01.aula14.service;

import com.modulo01.aula14.modelo.Cliente;

// 1. Criando um evento customizado
public class ClienteAtivadoEvent {

	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
