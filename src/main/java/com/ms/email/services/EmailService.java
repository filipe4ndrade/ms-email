package com.ms.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.email.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository repository;
}
