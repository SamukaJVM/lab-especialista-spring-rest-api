package com.modulo01.aula09.notificacao;

import com.modulo01.aula09.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}