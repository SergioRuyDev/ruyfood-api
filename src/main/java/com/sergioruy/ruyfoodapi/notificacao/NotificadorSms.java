package com.sergioruy.ruyfoodapi.notificacao;

import com.sergioruy.ruyfoodapi.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(),
                cliente.getTelefone(), mensagem);
    }
}
