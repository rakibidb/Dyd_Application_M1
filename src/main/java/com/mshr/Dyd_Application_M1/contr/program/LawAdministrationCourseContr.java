package com.mshr.Dyd_Application_M1.contr.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mshr.Dyd_Application_M1.model.program.LawAdministrationCourse;
import com.mshr.Dyd_Application_M1.repository.program.LawAdministrationCourseRepo;

@Controller
@RequestMapping("/admin")
public class LawAdministrationCourseContr {

	@Autowired
	private LawAdministrationCourseRepo repo;

	@PostMapping("/SaveL")
	public String save(LawAdministrationCourse l) {
		repo.save(l);
		return "/admin/law_administration_course";
	}

	@GetMapping("/findAllL")
	public String findAllL(Model model) {
		model.addAttribute("", repo.findAll());
		return "/admin/law_administration_course";
	}

}
