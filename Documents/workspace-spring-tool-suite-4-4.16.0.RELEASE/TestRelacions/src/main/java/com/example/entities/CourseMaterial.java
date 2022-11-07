package com.example.entities;

import javax.persistence.OneToOne;

public class CourseMaterial {
	@OneToOne
	private Curs curs;
	String url;
	
	@Override
	public String toString() {
		return "CourseMaterial [url=" + url + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
