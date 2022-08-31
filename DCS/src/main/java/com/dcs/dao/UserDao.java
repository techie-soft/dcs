package com.dcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dcs.model.Student;

@Component
public class UserDao {
	private static List<Student> list = new ArrayList<>();
	static {

		list.add(new Student(1, "Pritish"));
		list.add(new Student(2, "Sree"));
		list.add(new Student(3, "John"));
		list.add(new Student(4, "Neb"));
		list.add(new Student(5, "Deb"));
		list.add(new Student(6, "Modi"));

	}

	public List<Student> getAllStudents() {
		return list;
	}

	public Student getStudentById(int id) {

		return list.stream().filter(std -> std.getId() == id).findAny().get();

	}

	public void addStudent(Student student) {

		list.add(student);

	}
}
