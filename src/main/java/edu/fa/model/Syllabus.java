package edu.fa.model;

import javax.persistence.Embeddable;

@Embeddable
public class Syllabus {
	private String content;
	private int duration;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Syllabus(String content, int duration) {
		super();
		this.content = content;
		this.duration = duration;
	}

	public Syllabus() {
		super();
		// TODO Auto-generated constructor stub
	}

}
