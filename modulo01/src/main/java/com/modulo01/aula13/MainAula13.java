package com.modulo01.aula13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula13")
public class MainAula13 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula13.class, args);
		/* 13 - Criando métodos de callback do ciclo de vida dos beans
		* Aplicando anotação @PostConstruct e @PreDestroy na AtivacaoClienteService
		* Aplicando @Bean(initMethod = "init", destroyMethod = "destroy") na configuração do bean AtivacaoClienteService
		*/


	}

}
