package com.sergioruy.ruyfoodapi.service;

import com.sergioruy.ruyfoodapi.modelo.Cliente;
import com.sergioruy.ruyfoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
