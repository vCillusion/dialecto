package com.madeforindia.dialecto.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="apparel")
public class Apparel {
	
	@Id
	private String id;
	
	private String singular;
	private String plural;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSingular() {
		return singular;
	}

	public void setSingular(String singular) {
		this.singular = singular;
	}

	public String getPlural() {
		return plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
	}
}
