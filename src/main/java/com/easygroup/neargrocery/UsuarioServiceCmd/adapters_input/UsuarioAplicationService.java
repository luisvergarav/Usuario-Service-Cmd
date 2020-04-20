package com.easygroup.neargrocery.UsuarioServiceCmd.adapters_input;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain.RolesAggregate;
import com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain.UsuarioAggregate;
import com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain.UsuarioServiceImpl;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.eventsource.domain.message.Message;
import com.easygroup.neargrocery.UsuarioServiceCmd.eventsource.service.DomainEventSourceSender;
import com.easygroup.neargrocery.UsuarioServiceCmd.vo.UsuarioRequest;


@Service("storeApplicationService")
public class UsuarioAplicationService {
	//@Autowired
	//private DomainEventSourceSender messageSender;

	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	
	public void addUsuario(UsuarioRequest usuarioRequest) {

		
		UsuarioAggregate usuario = new UsuarioAggregate.Builder()
				.setActivo(usuarioRequest.getActivo())
				.setNick(usuarioRequest.getNick())
				.setNombre(usuarioRequest.getNombre())
				.setPassword((new BCryptPasswordEncoder()).encode( usuarioRequest.getPassword()))
				
				.setUsuarioRoles(Arrays.asList(new String(usuarioRequest.getRole())))
				.build();

		if (usuario.isValid()) {

			try {
				usuarioService.add(usuario);
				Message<UsuarioAggregate> message = new Message<UsuarioAggregate>("usuarioCreatedEvent",usuario);
				//messageSender.send(message);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
