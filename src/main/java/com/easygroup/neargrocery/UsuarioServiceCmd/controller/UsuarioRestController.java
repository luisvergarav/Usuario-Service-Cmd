package com.easygroup.neargrocery.UsuarioServiceCmd.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.easygroup.neargrocery.UsuarioServiceCmd.adapters_input.UsuarioAplicationService;
import com.easygroup.neargrocery.UsuarioServiceCmd.vo.UsuarioRequest;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
public class UsuarioRestController {

	@Autowired
	UsuarioAplicationService usuarioApplicationService;

	@RequestMapping(path = "/api/user", method = POST)
	public ResponseEntity<UsuarioRequest> addUsuario(@RequestBody UsuarioRequest usuarioRequest) {
		usuarioApplicationService.addUsuario(usuarioRequest);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	
}