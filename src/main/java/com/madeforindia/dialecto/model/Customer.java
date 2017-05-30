package com.madeforindia.dialecto.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customers")
public class Customer {
	
	@Id
	private String id;
	
	private String name;
	private SnapshotSetting setting;
	private List<CategorySnapshot> snapshots;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SnapshotSetting getSetting() {
		return setting;
	}
	public void setSetting(SnapshotSetting setting) {
		this.setting = setting;
	}
	public List<CategorySnapshot> getSnapshots() {
		return snapshots;
	}
	public void setSnapshots(List<CategorySnapshot> snapshots) {
		this.snapshots = snapshots;
	}
	
	
}
