package com.madeforindia.dialecto.model;

import java.util.List;

public class LiveExperiment {
	
	private List<LiveSample> samples;
	private Result overallResult;
	
	public List<LiveSample> getSamples() {
		return samples;
	}

	public void setSamples(List<LiveSample> samples) {
		this.samples = samples;
	}

	public Result getOverallResult() {
		return overallResult;
	}

	public void setOverallResult(Result overallResult) {
		this.overallResult = overallResult;
	}
	
	
}
