package com.mshr.Dyd_Application_M1.model.program;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LawAdministrationCourse {

	@Id
	@GeneratedValue
	private Integer id;

	private String course_name;
	private String duration;
	private String trainees_stage;

	public LawAdministrationCourse() {

	}

	public LawAdministrationCourse(Integer id, String course_name, String duration, String trainees_stage) {

		this.id = id;
		this.course_name = course_name;
		this.duration = duration;
		this.trainees_stage = trainees_stage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTrainees_stage() {
		return trainees_stage;
	}

	public void setTrainees_stage(String trainees_stage) {
		this.trainees_stage = trainees_stage;
	}

}
