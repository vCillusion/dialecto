package com.madeforindia.dialecto.model;

import java.util.Date;
import java.util.List;

public class Snapshot {
	
	private Date runtime;
	private boolean isCompleted;
	private boolean isError;
	private String error;
	private List<CategorySnapshot> categorySnapshots;
	
	public Date getRuntime() {
		return runtime;
	}
	public void setRuntime(Date runtime) {
		this.runtime = runtime;
	}
	public List<CategorySnapshot> setCategorySnapshots() {
		return categorySnapshots;
	}
	public void setCategorySnapshots(List<CategorySnapshot> categorySnapshots) {
		this.categorySnapshots = categorySnapshots;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public boolean isError() {
		return isError;
	}
	public void setError(boolean isError) {
		this.isError = isError;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
