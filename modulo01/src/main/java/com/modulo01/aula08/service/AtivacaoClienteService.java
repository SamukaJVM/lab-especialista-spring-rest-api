package com.modulo01.aula08.service;

import java.util.List;

import com.modulo01.aula08.modelo.Cliente;
import com.modulo01.aula08.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
//    private Notificador notificador; Ambiguidade de beans e injeção de lista de beans
    private List<Notificador> notificadores; // resolvendo Ambiguidade

    public void ativar(Cliente cliente) {
        cliente.ativar();

        // resolvendo Ambiguidade, percorrendo NotificadorEmail e NotificadorSMS
        for (Notificador notificador : notificadores) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
    }

}
