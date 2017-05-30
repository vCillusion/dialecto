package com.madeforindia.dialecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="clothes")
public class Cloth {
	
	@Id
	private String id;
	
	private String english;
	private String hindi;
	private String bengali;
	private String marathi;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}
	

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getBengali() {
		return bengali;
	}

	public void setBengali(String bengali) {
		this.bengali = bengali;
	}

	public String getMarathi() {
		return marathi;
	}

	public void setMarathi(String marathi) {
		this.marathi = marathi;
	}


}
