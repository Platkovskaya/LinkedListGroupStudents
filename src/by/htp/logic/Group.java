package by.htp.logic;

import java.util.LinkedList;
import java.util.List;

import by.htp.model.Student;

public class Group {
	private String title;
	private List<Student> students = new LinkedList<Student>();

	public Group(String title) {
		this.title = title;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void showStudents() {
		System.out.println("Group '" + title + "':");
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public void findOfStudent(Student student) {
		System.out.println("Finding '" + student + "' student...");

		if (this.students.contains(student)) {
			System.out.println("Student '" + student + "' was found!");
		} else {
			System.out.println("Student '" + student + "' was not found!");
		}
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
		System.out.println("Student: " + student + " was removed.");
	}

}
