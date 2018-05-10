package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class RecentWork {

	@GetMapping("/recent_work")
	public String recent_work() {
		return "admin/recent_work";
	}

	@GetMapping("/opening_ceremony")
	public String opening_ceremony() {
		return "admin/opening_ceremony";
	}

	@GetMapping("/closing_ceremony")
	public String closing_ceremony() {
		return "admin/closing_ceremony";
	}

	@GetMapping("/mes_night")
	public String mes_night() {
		return "admin/mes_night";
	}
}
