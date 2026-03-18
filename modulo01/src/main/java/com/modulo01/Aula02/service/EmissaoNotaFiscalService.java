package com.modulo01.Aula02.service;

import com.modulo01.Aula02.modelo.Cliente;
import com.modulo01.Aula02.modelo.Produto;
import com.modulo01.Aula02.notificacao.Notificador;

public class EmissaoNotaFiscalService {

	private Notificador notificador;

	/* injeção de dependências Motificador de forma manual */
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		this.notificador.notificar(cliente, "Nota fiscal do produto "
				+ produto.getNome() + " foi emitida!");
	}
	
}
