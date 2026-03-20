package com.modulo01.aula15.notificacao;

import com.modulo01.aula15.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}