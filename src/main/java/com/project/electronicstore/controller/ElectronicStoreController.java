package com.project.electronicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElectronicStoreController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
}
