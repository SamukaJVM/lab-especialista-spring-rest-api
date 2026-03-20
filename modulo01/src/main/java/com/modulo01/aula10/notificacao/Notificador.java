package com.modulo01.aula10.notificacao;

import com.modulo01.aula10.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}