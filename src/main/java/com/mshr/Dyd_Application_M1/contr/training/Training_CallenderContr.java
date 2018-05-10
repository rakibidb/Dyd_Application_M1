package com.mshr.Dyd_Application_M1.contr.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mshr.Dyd_Application_M1.model.training.Training_Callender;
import com.mshr.Dyd_Application_M1.repository.training.Training_CallenderRepo;

@Controller
@RequestMapping("/admin")
public class Training_CallenderContr {

	@Autowired
	private Training_CallenderRepo training_CallenderRepo;

	// data updating purpose Completed
	@PostMapping("/updateOne")
	public String update(@RequestParam("editor_id") Integer id, @RequestParam("editor") String editor) {
		Training_Callender training_Callender = training_CallenderRepo.findOne(id);
		training_Callender.setEditor(editor);
		training_CallenderRepo.save(training_Callender);
		return "/admin/training_callender";
	}

	// page direct & url mapping & show data from database to text area.
	@GetMapping(value = "/training_callender", produces = MediaType.TEXT_XML_VALUE)
	public String training_callenders(Model model) {
		model.addAttribute("training_Callender", training_CallenderRepo.findOne(5));
		return "/admin/training_callender";
	}

	/*
	 * @PostMapping("/addTrainingCallender") public String
	 * addTrainingCallenders(Training_Callender training_Callender) {
	 * training_CallenderRepo.save(training_Callender); return
	 * "/admin/training_callender"; }
	 */

}

/*
 * @GetMapping("/training_callenders_list") public String
 * training_callenders_list(Model model) {
 * model.addAttribute("all_training_callenders_list",
 * training_CallenderRepo.findAll()); return "/admin/training_callender"; }
 */