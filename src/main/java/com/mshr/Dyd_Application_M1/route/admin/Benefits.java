package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Benefits {

	@GetMapping("/library")
	public String training_method() {
		return "admin/library";
	}

	@GetMapping("/computer_lab")
	public String online_registration() {
		return "admin/computer_lab";
	}

	@GetMapping("/language_lab")
	public String training_manual() {
		return "admin/language_lab";
	}
}
