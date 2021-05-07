package com.sergioruy.ruyfoodapi.listener;

import com.sergioruy.ruyfoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para Cliente " + event.getCliente().getNome());
    }
}
