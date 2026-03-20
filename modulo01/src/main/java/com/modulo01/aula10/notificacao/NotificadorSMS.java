package com.modulo01.aula10.notificacao;

import com.modulo01.aula10.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
