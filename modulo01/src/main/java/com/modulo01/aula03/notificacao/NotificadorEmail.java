package com.modulo01.aula03.notificacao;

import com.modulo01.aula03.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component /* 03 - Definindo beans com @Component */
public class NotificadorEmail {

	public NotificadorEmail() {
		System.out.println("NotificadorEmail agora é Bean Gerenciado pelo Sring");
	}

	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
