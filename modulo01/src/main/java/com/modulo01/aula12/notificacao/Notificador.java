package com.modulo01.aula12.notificacao;

import com.modulo01.aula12.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}