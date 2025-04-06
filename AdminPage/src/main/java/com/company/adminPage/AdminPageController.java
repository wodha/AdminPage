package com.company.adminPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminPageController {

	@GetMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/test")
	public String test() {
		return "test";
	}
}
