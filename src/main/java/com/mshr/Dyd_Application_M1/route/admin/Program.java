package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Program {

	@GetMapping("/law_administration_course")
	public String law_administration_course() {
		return "admin/law_administration_course";
	}

	@GetMapping("/basic_training_course")
	public String basic_training_course() {
		return "admin/basic_training_course";
	}

}
