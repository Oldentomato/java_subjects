package lab.student.control;

import lab.student.entity.Student;
import lab.student.exception.InsufficientStudentException;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student("20181416","��μ�","��ǻ�Ͱ���","3�г�");
		System.out.println(String.format("%s / %s / %s", stu.getName(),stu.getMajor(),stu.getGrade()));
		try {
			stu.setGrade("5�г�");
		} catch (InsufficientStudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
