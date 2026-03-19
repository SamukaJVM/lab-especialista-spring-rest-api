package com.modulo01.aula02;

import com.modulo01.aula02.modelo.Cliente;
import com.modulo01.aula02.modelo.Produto;
import com.modulo01.aula02.notificacao.NotificadorEmail;
import com.modulo01.aula02.notificacao.NotificadorSMS;
import com.modulo01.aula02.service.AtivacaoClienteService;
import com.modulo01.aula02.service.EmissaoNotaFiscalService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.Aula02")
public class MainAula02 {

    public static void main(String[] args) {
        /* - 02 - O que é injeção de dependências
        * injeção de dependências sem spring de forma manual do Notificador nas Classes AtivacaoClienteService
        * injeção de dependências sem spring de forma manual do Notificador nas Classes EmissaoNotaFiscalService
        */

        var maria = new Cliente("Maria", "maria@xyz.com", "1177772222");
        var joao = new Cliente("João", "joao@xyz.com", "3499998888");

        var notificadorSMS = new NotificadorSMS();
        var notificadorEmail = new NotificadorEmail();

        /* injeção de dependências Motificador de forma manual */
        var ativacaoCliente = new AtivacaoClienteService(notificadorSMS);
        var notaFiscal = new EmissaoNotaFiscalService(notificadorEmail);

        System.out.println("-------------------------------------");
        ativacaoCliente.ativar(maria);
        notaFiscal.emitir(maria, new Produto("Geladeira", new BigDecimal(4500)));

        System.out.println("-------------------------------------");
        ativacaoCliente.ativar(joao);
        notaFiscal.emitir(joao, new Produto("Notebook", new BigDecimal(3500)));
    }

}
