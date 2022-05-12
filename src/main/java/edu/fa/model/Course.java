package edu.fa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Syllabus> syllabuses = new ArrayList<Syllabus>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Syllabus> getSyllabuses() {
		return syllabuses;
	}

	public void setSyllabuses(List<Syllabus> syllabuses) {
		this.syllabuses = syllabuses;
	}

	public Course() {
		super();
	}
	
	

	public Course(String name) {
		super();
		this.name = name;
	}

	public Course(String name, Date createdDate) {
		super();
		this.name = name;
		this.createdDate = createdDate;
	}

	public Course(String name, Date createdDate, List<Syllabus> syllabuses) {
		super();
		this.name = name;
		this.createdDate = createdDate;
		this.syllabuses = syllabuses;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
