package com.modulo01.aula16.listener;

import com.modulo01.aula16.notificacao.NivelUrgencia;
import com.modulo01.aula16.notificacao.Notificador;
import com.modulo01.aula16.notificacao.TipoDoNotificador;
import com.modulo01.aula16.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

	// 3. Criando um listener para o evento
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		// Lógica de resposta ao evento
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }

}
