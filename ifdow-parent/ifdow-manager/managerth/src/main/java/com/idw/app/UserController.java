package com.idw.app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
