package com.sergioruy.ruyfoodapi.service;

import com.sergioruy.ruyfoodapi.modelo.Cliente;
import com.sergioruy.ruyfoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        if (notificador != null) {
            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        } else {
            System.out.printf("Não existe notificador, mais cliente foi ativado.");
        }
    }
}
