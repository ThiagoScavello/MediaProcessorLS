package com.libersphere.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
public class MainController {
	
	@PostMapping("/test")
	public void test() {
		System.out.println("funcionou");
	}

}
