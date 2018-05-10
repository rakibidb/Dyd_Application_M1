package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Communication {

	@GetMapping("/employees_email_id")
	public String employees_email_id() {
		return "admin/employees_email_id";
	}

	@GetMapping("/facebook_page")
	public String facebook_page() {
		return "admin/facebook_page";
	}

	@GetMapping("/email_login")
	public String email_login() {
		return "admin/email_login";
	}

	@GetMapping("/office_address")
	public String office_address() {
		return "admin/office_address";
	}
}
