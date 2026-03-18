package com.modulo01.aula02.notificacao;

import com.modulo01.aula02.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
