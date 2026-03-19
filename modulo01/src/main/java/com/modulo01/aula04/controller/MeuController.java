package com.modulo01.aula04.controller;

import com.modulo01.aula04.modelo.Cliente;
import com.modulo01.aula04.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("4º Spring Injetando o Bean no Controller: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        var joao = new Cliente("João", "joao@xyz.com", "3499998888");
        ativacaoClienteService.ativar(joao);
        return "Injetando dependências (beans Spring)!";
    }
}
