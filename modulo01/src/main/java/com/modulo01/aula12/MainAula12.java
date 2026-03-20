package com.modulo01.aula12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.modulo01.aula12")
public class MainAula12 {

	public static void main(String[] args) {
		SpringApplication.run(MainAula12.class, args);
		/* 12 - Mudando o comportamento da aplicação com Spring Profiles
		* Spring Profiles é um recurso do Spring que permite definir diferentes configurações
		* para diferentes ambientes (desenvolvimento, produção, teste, etc.).
		* Com Spring Profiles, podemos criar beans específicos para cada ambiente
		* e ativar o perfil correspondente para que a aplicação use os beans adequados.
		* No exemplo, temos dois beans de notificação: NotificadorEmail (para produção)
		* e NotificadorEmailMock (para desenvolvimento). Cada um é anotado com @Profile
		* para indicar em qual ambiente deve ser usado. Para ativar um perfil, podemos usar a propriedade
		* "spring.profiles.active" no arquivo application.properties ou passar como argumento na linha de comando.
		*/


	}

}
