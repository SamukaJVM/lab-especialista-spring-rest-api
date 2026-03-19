package com.modulo01.aula05.notificacao;

import com.modulo01.aula05.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}