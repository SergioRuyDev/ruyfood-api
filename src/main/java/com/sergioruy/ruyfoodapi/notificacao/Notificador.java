package com.sergioruy.ruyfoodapi.notificacao;

import com.sergioruy.ruyfoodapi.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
