package com.modulo01.aula08.notificacao;

import com.modulo01.aula08.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}