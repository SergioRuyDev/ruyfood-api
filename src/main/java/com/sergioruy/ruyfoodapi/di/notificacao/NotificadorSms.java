package com.sergioruy.ruyfoodapi.di.notificacao;

import com.sergioruy.ruyfoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }
}
