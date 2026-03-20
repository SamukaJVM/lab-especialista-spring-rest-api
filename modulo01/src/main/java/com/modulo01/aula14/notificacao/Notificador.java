package com.modulo01.aula14.notificacao;

import com.modulo01.aula14.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}