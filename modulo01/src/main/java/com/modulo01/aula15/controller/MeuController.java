package com.modulo01.aula15.controller;

import com.modulo01.aula15.modelo.Cliente;
import com.modulo01.aula15.service.AtivacaoClienteService;
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
        return "15 - Criando e acessando propriedades customizadas com @Value";
    }
}
