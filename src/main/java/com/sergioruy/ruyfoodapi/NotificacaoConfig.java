package com.sergioruy.ruyfoodapi;

import com.sergioruy.ruyfoodapi.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.ruymail.com.br");
        notificador.setCaixaAlta(true);
        return notificador;
    }
}
