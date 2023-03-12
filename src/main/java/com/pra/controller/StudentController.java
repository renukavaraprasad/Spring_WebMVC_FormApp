package com.pra.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.pra.binding.Student;
import com.pra.repo.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/")
	public String loadStudentForm(Model model) {
		loadFormData(model);
		
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "index";
	}

	private void loadFormData(Model model) {
		List<String> coursesList = new ArrayList<>();
		coursesList.add("Java");
		coursesList.add("AWS");
		coursesList.add("DevOps");
		coursesList.add("Python");
		
		List<String> timingsList = new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("Afternoon");
		timingsList.add("Evening");
		
		model.addAttribute("couses", coursesList);
		model.addAttribute("timings", timingsList);
	}

	@PostMapping("save")
	public String saveStudentFormData(Student student, Model model) {
		System.out.println(student);
		
		com.pra.entity.Student studentEntity = new com.pra.entity.Student();
		BeanUtils.copyProperties(student, studentEntity);
		studentEntity.setTimings(Arrays.toString(student.getTimings()));
 		studentRepo.save(studentEntity);
 		
		model.addAttribute("student", student);
		
		loadFormData(model);
		
		return "index";
	}

	@GetMapping("")
	public String displayStudentFormData() {

		return "";
	}
}
