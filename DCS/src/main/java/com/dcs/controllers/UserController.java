package com.dcs.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
//	@Autowired
//	private UserDao userDao;
//	
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		System.out.println("request is coming");
		request.setAttribute("mode", "MODE_HOME");
		return "test";
	}
	
	
//	@GetMapping("/test")
//	public String test() {
//		return "Success";
//	}
//	
//	@GetMapping("/std")
//	public List<Student> getAllStd() {
//		List<Student> list = userDao.getAllStudents();
//		
//		return list;
//	}
//	
//	@GetMapping("/std/{id}")
//	public Student getAllStd(@PathVariable int id) {
//		Student std = userDao.getStudentById(id);
//		
//		return std;
//	}
//	
//	@PostMapping("/std")
//	public String addStudent(@RequestBody Student student) {
//		userDao.addStudent(student);
//		
//		return "success";
//	}
}


