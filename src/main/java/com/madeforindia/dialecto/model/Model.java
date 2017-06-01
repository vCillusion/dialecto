package com.madeforindia.dialecto.model;

import org.springframework.data.annotation.Id;

public class Model {

	@Id
	private String id;
	
	private ModelEntry en;
	private ModelEntry hi;
	private ModelEntry gu;
	private ModelEntry ml;
	private ModelEntry mr;
	private ModelEntry pa;
	private ModelEntry te;
	private ModelEntry ta;
	private ModelEntry bn;
	private ModelEntry kn;
	private ModelEntry or;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ModelEntry getEn() {
		return en;
	}
	public void setEn(ModelEntry en) {
		this.en = en;
	}
	public ModelEntry getHi() {
		return hi;
	}
	public void setHi(ModelEntry hi) {
		this.hi = hi;
	}
	public ModelEntry getGu() {
		return gu;
	}
	public void setGu(ModelEntry gu) {
		this.gu = gu;
	}
	public ModelEntry getMl() {
		return ml;
	}
	public void setMl(ModelEntry ml) {
		this.ml = ml;
	}
	public ModelEntry getMr() {
		return mr;
	}
	public void setMr(ModelEntry mr) {
		this.mr = mr;
	}
	public ModelEntry getPa() {
		return pa;
	}
	public void setPa(ModelEntry pa) {
		this.pa = pa;
	}
	public ModelEntry getTe() {
		return te;
	}
	public void setTe(ModelEntry te) {
		this.te = te;
	}
	public ModelEntry getTa() {
		return ta;
	}
	public void setTa(ModelEntry ta) {
		this.ta = ta;
	}
	public ModelEntry getBn() {
		return bn;
	}
	public void setBn(ModelEntry bn) {
		this.bn = bn;
	}
	public ModelEntry getKn() {
		return kn;
	}
	public void setKn(ModelEntry kn) {
		this.kn = kn;
	}
	public ModelEntry getOr() {
		return or;
	}
	public void setOr(ModelEntry or) {
		this.or = or;
	}
	
	
}
