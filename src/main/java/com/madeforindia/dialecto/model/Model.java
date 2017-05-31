package com.madeforindia.dialecto.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Model {

	@Id
	private String id;
	private List<ModelEntry> entries;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ModelEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<ModelEntry> entries) {
		this.entries = entries;
	}
}
