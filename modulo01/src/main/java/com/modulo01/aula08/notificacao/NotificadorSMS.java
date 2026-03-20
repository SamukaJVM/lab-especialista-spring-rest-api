package com.modulo01.aula08.notificacao;

import com.modulo01.aula08.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
