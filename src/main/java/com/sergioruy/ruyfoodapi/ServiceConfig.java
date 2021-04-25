package com.sergioruy.ruyfoodapi;

import com.sergioruy.ruyfoodapi.notificacao.Notificador;
import com.sergioruy.ruyfoodapi.notificacao.NotificadorEmail;
import com.sergioruy.ruyfoodapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        return new AtivacaoClienteService(notificador);
    }
}
