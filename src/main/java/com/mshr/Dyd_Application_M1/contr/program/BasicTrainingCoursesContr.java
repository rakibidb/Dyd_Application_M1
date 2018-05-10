package com.mshr.Dyd_Application_M1.contr.program;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mshr.Dyd_Application_M1.model.program.BasicTrainingCourses;
import com.mshr.Dyd_Application_M1.repository.program.BasicTrainingCoursesRepo;

@Controller
@RequestMapping("/admin")
public class BasicTrainingCoursesContr {

	@Autowired
	private BasicTrainingCoursesRepo repo;

	@PostMapping("/SaveB")
	public String save(BasicTrainingCourses b) {
		repo.save(b);
		return "/admin/basic_training_course";
	}

	@GetMapping("/findAllB")
	public String findAllB(Model model) {
		model.addAttribute("", repo.findAll());
		return "/admin/basic_training_course";
	}

}
