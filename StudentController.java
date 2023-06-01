package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Student;
import com.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private  StudentService studentService;
	
	@GetMapping("/{studentId}")
	public Student getStudentById(@PathVariable int studentId)
	{
		return studentService.getStudentById(studentId);
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@PutMapping("/{studentId}")
	public  Student updateStudent(@PathVariable int studentId, @RequestBody Student student)
	{
		return studentService.updateStudent(studentId, student);
	}
	
	@DeleteMapping("/{studentId}")
	public void deleteStudent(@PathVariable int studentId)
	{
		studentService.deleteStudent(studentId);
	}
}
