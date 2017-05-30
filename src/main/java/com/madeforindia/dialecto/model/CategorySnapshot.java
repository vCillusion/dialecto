package com.madeforindia.dialecto.model;

import java.util.Date;
import java.util.List;

public class CategorySnapshot {
	
	private String category;
	private Date runtime;
	private boolean isCompleted;
	private boolean isError;
	private String error;
	private List<LiveExperiment> liveExperiments;
	
	public Date getRuntime() {
		return runtime;
	}
	public void setRuntime(Date runtime) {
		this.runtime = runtime;
	}
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<LiveExperiment> getLiveExperiments() {
		return liveExperiments;
	}
	public void setLiveExperiments(List<LiveExperiment> liveExperiments) {
		this.liveExperiments = liveExperiments;
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
