package com.mshr.Dyd_Application_M1.model.training;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Training_Callender {

	@Id
	@GeneratedValue
	private Integer id;

	private String editor;

	public Training_Callender() {

	}

	public Training_Callender(Integer id, String editor) {

		this.id = id;
		this.editor = editor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

}
