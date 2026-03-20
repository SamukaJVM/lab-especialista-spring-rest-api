package com.modulo01.aula07.notificacao;


import com.modulo01.aula07.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}