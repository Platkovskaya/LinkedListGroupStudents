package by.htp.mainrunner;

import by.htp.logic.Group;
import by.htp.model.Student;

public class MainApp {

	public static void main(String[] args) {

		Group gr = new Group("123");

		Student s1 = new Student("Ivan", "Ivanov");
		Student s2 = new Student("Petr", "Petrov");
		Student s3 = new Student("Nikolay", "Sidorov");
		Student s4 = new Student("Marina", "Andreeva");
		Student s5 = new Student("Svetlana", "Smirnova");

		gr.addStudent(s1);
		gr.addStudent(s2);
		gr.addStudent(s3);
		gr.addStudent(s4);
		gr.addStudent(s5);
		gr.showStudents();
		System.out.println();
		gr.removeStudent(s2);
		System.out.println();
		gr.showStudents();
		System.out.println();
		gr.findOfStudent(s2);

	}

}
