package com.example.model;

public class NewsCovid {
	private String title;
	private String link;
	private String imgSource;
	private String source;
	public NewsCovid() {
		super();
	}
	public NewsCovid(String title, String link, String imgSource, String source) {
		super();
		this.title = title;
		this.link = link;
		this.imgSource = imgSource;
		this.source = source;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImgSource() {
		return imgSource;
	}
	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
