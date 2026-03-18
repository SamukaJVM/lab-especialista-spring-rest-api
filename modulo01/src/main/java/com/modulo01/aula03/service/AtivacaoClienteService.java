package com.modulo01.aula03.service;

import com.modulo01.aula03.modelo.Cliente;
import com.modulo01.aula03.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component /* 03 - Definindo beans com @Component */
public class AtivacaoClienteService {

	private NotificadorEmail notificador;

	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService agora é Bean Gerenciado pelo Sring");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
