package com.modulo01.aula08.controller;

import com.modulo01.aula08.modelo.Cliente;
import com.modulo01.aula08.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
        ativacaoClienteService.ativar(joao);
        return "08 - Ambiguidade de beans e injeção de lista de beans";
    }
}
