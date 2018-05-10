package com.mshr.Dyd_Application_M1.contr.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mshr.Dyd_Application_M1.model.training.OnlineReg;
import com.mshr.Dyd_Application_M1.repository.training.OnlineRegRepo;

@Controller
@RequestMapping("/admin")
public class OnlineRegContr {

	@Autowired
	private OnlineRegRepo onlineRegRepo;

	@PostMapping("/saveUser")
	public String userIdSave(OnlineReg onlineReg) {
		onlineRegRepo.save(onlineReg);
		return "/admin/online_registration";
	}

	@GetMapping("/allUsers")
	public String allUsers(Model model) {
		model.addAttribute("users", onlineRegRepo.findAll());
		return "/admin/online_registration";
	}

}
