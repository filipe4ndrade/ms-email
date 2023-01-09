package com.ms.email.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;

import jakarta.validation.Valid;

@RestController
public class EmailController {

	@Autowired
	private EmailService service;
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
		EmailModel emailModel = new EmailModel();
		//Converte dto pra model
		BeanUtils.copyProperties(emailDto, emailModel);
		service.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel,HttpStatus.CREATED);
	}
	
}
