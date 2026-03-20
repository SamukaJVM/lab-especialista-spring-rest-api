package com.modulo01.aula14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula14")
public class MainAula14 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula14.class, args);
		/* 14 - Publicando e consumindo eventos customizados
		* 1. Criar um evento customizado em AtivacaoClienteService
		* 2. Criar um listener para o evento
		* 3. Publicar o evento
		*/

	}

}
