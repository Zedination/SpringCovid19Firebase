package com.example.model;

public class DataVietNam {
	private String caNhiem;
	private String tuVong;
	private String hoiPhuc;
	private String contentHtml;
	public DataVietNam() {
		super();
	}
	public DataVietNam(String caNhiem, String tuVong, String hoiPhuc, String contentHtml) {
		super();
		this.caNhiem = caNhiem;
		this.tuVong = tuVong;
		this.hoiPhuc = hoiPhuc;
		this.contentHtml = contentHtml;
	}
	public String getCaNhiem() {
		return caNhiem;
	}
	public void setCaNhiem(String caNhiem) {
		this.caNhiem = caNhiem;
	}
	public String getTuVong() {
		return tuVong;
	}
	public void setTuVong(String tuVong) {
		this.tuVong = tuVong;
	}
	public String getHoiPhuc() {
		return hoiPhuc;
	}
	public void setHoiPhuc(String hoiPhuc) {
		this.hoiPhuc = hoiPhuc;
	}
	public String getContentHtml() {
		return contentHtml;
	}
	public void setContentHtml(String contentHtml) {
		this.contentHtml = contentHtml;
	}
	
}
