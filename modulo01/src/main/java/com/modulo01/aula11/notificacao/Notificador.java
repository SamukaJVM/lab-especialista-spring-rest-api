package com.modulo01.aula11.notificacao;

import com.modulo01.aula11.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}