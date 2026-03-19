package com.modulo01.aula06.notificacao;

import com.modulo01.aula06.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}