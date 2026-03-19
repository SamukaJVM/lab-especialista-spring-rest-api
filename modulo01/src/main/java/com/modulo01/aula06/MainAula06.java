package com.modulo01.aula06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula06")
public class MainAula06 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula06.class, args);
		/* - 06 - Conhecendo os pontos de injeção e a anotação @Autowired
		* Anotando @Autowired nos atributos da Classe AtivacaoClienteService
		* Anotando @Autowired no construtor da Classe AtivacaoClienteService
		* Anotando @Autowired nos setters da Classe AtivacaoClienteService
		*/
	}

}
