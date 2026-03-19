package com.modulo01.aula04.service;

import com.modulo01.aula04.modelo.Cliente;
import com.modulo01.aula04.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("2º Spring Instanciou o Bean AtivacaoClienteService");
        System.out.println("3º Spring Injetando o Bean no AtivacaoClienteService: " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
