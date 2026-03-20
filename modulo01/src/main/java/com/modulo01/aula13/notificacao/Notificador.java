package com.modulo01.aula13.notificacao;

import com.modulo01.aula13.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}