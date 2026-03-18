package com.modulo01.Aula02.notificacao;

import com.modulo01.Aula02.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}
