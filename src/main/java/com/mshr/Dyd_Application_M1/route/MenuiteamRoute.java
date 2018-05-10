package com.mshr.Dyd_Application_M1.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuiteamRoute {

	@GetMapping("/academy")
	public String academy() {
		return "/menu/about-academy";
	}

	@GetMapping("/closing_program")
	public String closing_program() {
		return "/menu/closing-program";
	}

	@GetMapping("/ongoing")
	public String ongoing() {
		return "/menu/on-going-training";
	}

	@GetMapping("/rightInformationtoact")
	public String rightInformationtoact() {
		return "/menu/rightInformationtoact";
	}

	@GetMapping("/ict_comision")
	public String ict_comision() {
		return "/menu/ict_comision";
	}

	@GetMapping("/organizational_structure")
	public String organizational_structure() {
		return "/menu/organizational_structure";
	}
	@GetMapping("/opinions")
	public String opinions() {
		return "/menu/opinions";
	}


	@GetMapping("/project")
	public String project() {
		return "/menu/project";
	}

	@GetMapping("/trainingac")
	public String training_anualCallender() {
		return "/menu/training_anualCallender";
	}

	@GetMapping("/trainingCourse")
	public String training_course() {
		return "/menu/training_course";
	}

	@GetMapping("/employees")
	public String employees() {
		return "/menu/employees";
	}

	@GetMapping("/trainingMathod")
	public String training_method() {
		return "/menu/training_method";
	}

	@GetMapping("/complete_program")
	public String complete_program() {
		return "/menu/completed-training";
	}

	@GetMapping("/history")
	public String history() {
		return "/menu/history";
	}

	@GetMapping("/mission")
	public String mission() {
		return "/menu/mission-vission";
	}

	@GetMapping("/principal")
	public String princial() {
		return "/menu/principal-details";
	}

}
