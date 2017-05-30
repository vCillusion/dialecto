package com.madeforindia.dialecto.model;

public class LiveExperiment {
	
	private ExperimentText text;
	private ExperimentEvidence evidence;
	private ExperimentResult result;
	
	public ExperimentText getText() {
		return text;
	}
	public void setText(ExperimentText text) {
		this.text = text;
	}
	public ExperimentEvidence getEvidence() {
		return evidence;
	}
	public void setEvidence(ExperimentEvidence evidence) {
		this.evidence = evidence;
	}
	public ExperimentResult getResult() {
		return result;
	}
	public void setResult(ExperimentResult result) {
		this.result = result;
	}
	
	

}
