package com.sergioruy.ruyfoodapi.service;

import com.sergioruy.ruyfoodapi.modelo.Cliente;
import com.sergioruy.ruyfoodapi.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
