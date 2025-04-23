package lab.student.entity;

import lab.student.exception.InsufficientStudentException;

public class Student {
	private String studentId;
	private String name;
	private String major;
	private String grade;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major){

		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) throws InsufficientStudentException  {
		int gradeNum =  Integer.parseInt(grade.replaceAll("[^0-9]", ""));
		if(gradeNum > 4 || gradeNum < 1) {
			String errMessage = "학년은 1~4 사이여야 합니다.";
			throw new InsufficientStudentException(errMessage);
		}
		this.grade = grade;
	}


	public Student(String studentId, String name, String major, String grade) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}

}
