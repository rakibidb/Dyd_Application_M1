package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Training {

	@GetMapping("/panel")
	public String panel() {
		return "admin/index";
	}

	@GetMapping("/index")
	public String training_callenders() {
		return "admin/index";
	}

	@GetMapping("/training_method")
	public String training_method() {
		return "admin/training_method";
	}

	@GetMapping("/training_manual")
	public String training_manual() {
		return "admin/training_manual";
	}

	@GetMapping("/online_registration")
	public String online_registration() {
		return "admin/online_registration";
	}

}
