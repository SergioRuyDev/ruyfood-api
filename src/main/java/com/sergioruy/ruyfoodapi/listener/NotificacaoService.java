package com.sergioruy.ruyfoodapi.listener;

import com.sergioruy.ruyfoodapi.di.notificacao.NivelUrgencia;
import com.sergioruy.ruyfoodapi.di.notificacao.Notificador;
import com.sergioruy.ruyfoodapi.di.notificacao.TipoDoNotificador;
import com.sergioruy.ruyfoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void ClienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
