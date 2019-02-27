package com.app.springboot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

	@GetMapping
	@PreAuthorize("hasRole('USER')")
	//@PreAuthorize("hasRole('ADMIN')")
	public String checkAccessForApplication() {
		return "You are Authorized, welcome to our application";
	}

}
