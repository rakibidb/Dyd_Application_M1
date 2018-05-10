package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Download {

	@GetMapping("/allform")
	public String allform() {
		return "admin/allform";
	}

	@GetMapping("/softwares")
	public String softwares() {
		return "admin/softwares";
	}
}
