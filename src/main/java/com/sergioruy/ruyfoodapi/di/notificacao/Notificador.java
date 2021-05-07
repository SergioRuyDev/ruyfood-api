package com.sergioruy.ruyfoodapi.di.notificacao;

import com.sergioruy.ruyfoodapi.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
