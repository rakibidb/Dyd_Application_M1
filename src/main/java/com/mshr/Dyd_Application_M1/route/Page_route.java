package com.mshr.Dyd_Application_M1.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mshr.Dyd_Application_M1.repository.training.Training_CallenderRepo;

@Controller
public class Page_route {

	@Autowired
	private Training_CallenderRepo training_CallenderRepo;

	@GetMapping("/")
	public String homepage() {
		return "index";
	}

	@GetMapping("/সকল")
	public String allNotice() {
		return "notice";
	}

	// প্রশিক্ষণ
	@GetMapping("/প্রশিক্ষণ-ক্যালেন্ডার")
	public String trainingCallender(Model model) {
		model.addAttribute("training_Callender", training_CallenderRepo.findOne(5));
		return "/training-calendar";
	}

	@GetMapping("/trainingMethod")
	public String trainingMethod() {
		return "training-method";
	}

	@GetMapping("/onlineR")
	public String onlineReg() {
		return "onlineReg";
	}

	@GetMapping("/training_m")
	public String training_menual() {
		return "training_menual";
	}

	// ক্লাস রুটিন/প্রোগ্রাম
	@GetMapping("/law_adminstration")
	public String law_adminstration() {
		return "law_adminstration";
	}

	@GetMapping("/opinion")
	public String opinion() {
		return "opinion";
	}

	// সুবিধাদি
	@GetMapping("/library")
	public String library() {
		return "library";
	}

	@GetMapping("/computer")
	public String cmputer() {
		return "computer";
	}

	@GetMapping("/language")
	public String language() {
		return "language";
	}

	// সাম্প্রতিক কার্যক্রম

	@GetMapping("/recent_work")
	public String recent_work() {
		return "recent_work";
	}

	@GetMapping("/opening_ceremony")
	public String opening_ceremony() {
		return "opening_ceremony";
	}

	@GetMapping("/closing_ceremony")
	public String closing_ceremony() {
		return "closing_ceremony";
	}

	@GetMapping("/mes_night")
	public String mes_night() {
		return "mes_night";
	}

	// গ্যালারি

	@GetMapping("/photo_gallery")
	public String photo_gallery() {
		return "photo_gallery";
	}

	@GetMapping("/video_gallery")
	public String video_gallery() {
		return "video_gallery";
	}

	@GetMapping("/study_tour")
	public String study_tour() {
		return "study_tour";
	}

	// যোগাযোগ

	@GetMapping("/employees_email_id")
	public String employees_email_id() {
		return "employees_email_id";
	}

	@GetMapping("/facebook_page")
	public String facebook_page() {
		return "facebook_page";
	}

	@GetMapping("/email_login")
	public String email_login() {
		return "email_login";
	}

	@GetMapping("/office_address")
	public String office_address() {
		return "office_address";
	}

	// ডাউনলোড

	@GetMapping("/allform")
	public String allform() {
		return "allform";
	}

	@GetMapping("/softwares")
	public String softwares() {
		return "softwares";
	}

	// Logout controller
	@GetMapping("/logout")
	public String adminlogout() {
		return "admin/loginform";
	}

	// not permanent
	@GetMapping("/login")
	public String adminLogin() {
		return "admin/loginform";
	}

}
