package com.mshr.Dyd_Application_M1.route.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Gallery {

	@GetMapping("/photo_gallery")
	public String photo_gallery() {
		return "admin/photo_gallery";
	}

	@GetMapping("/video_gallery")
	public String video_gallery() {
		return "admin/video_gallery";
	}

	@GetMapping("/study_tour")
	public String study_tour() {
		return "admin/study_tour";
	}
}
