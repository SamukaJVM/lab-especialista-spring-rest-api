package com.modulo01.aula07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula07")
public class MainAula07 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula07.class, args);
		/* - 07 - Dependência opcional com @Autowired
		* Aplicando @Autowired(required = false) no AtivacaoClienteService,
		* a injeção de dependência do Notificador se torna opcional;
		* Se o Spring não encontrar um bean do tipo Notificador, ele simplesmente injetará null,
		* permitindo que o AtivacaoClienteService funcione sem um notificador;
		*/


	}

}
