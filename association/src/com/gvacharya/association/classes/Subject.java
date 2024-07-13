package com.gvacharya.association.classes;

public class Subject {
	private String subjectName;
	private String teacherName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + "]";
	}
	
	
}
