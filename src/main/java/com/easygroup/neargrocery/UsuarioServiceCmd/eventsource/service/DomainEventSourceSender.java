package com.easygroup.neargrocery.UsuarioServiceCmd.eventsource.service;

import com.easygroup.neargrocery.UsuarioServiceCmd.eventsource.domain.message.Message;

public interface DomainEventSourceSender {

    void send( final Message<?> event );
}
