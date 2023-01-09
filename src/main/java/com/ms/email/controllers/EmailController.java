package com.ms.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ms.email.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService service;
}
