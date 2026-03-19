package com.modulo01.aula06.service;

import com.modulo01.aula06.modelo.Cliente;
import com.modulo01.aula06.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {


	@Autowired // Usando Anotação nos atributos
	private Notificador notificador;
	
	@Autowired // Usando Anotação no construtor
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}

	public AtivacaoClienteService(String qualquer) {

	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

	@Autowired // Usando Anotação no setters
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
}
