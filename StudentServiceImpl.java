package com.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Entity.Student;
import com.demo.Repository.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private  StudentRepo studentRepo;
	@Override
	public Student getStudentById(int studentId) {
		
		return studentRepo.findById(studentId).orElse(null);
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(int studentId, Student student) {
		
		Student existingStudent=studentRepo.findById(studentId).orElse(null);
		if(existingStudent!=null)
		{
		existingStudent.setName(student.getName());
		existingStudent.setCity(student.getCity());
		existingStudent.setStream(student.getStream());
		existingStudent.setMobile(student.getMobile());
		return studentRepo.save(existingStudent);
		}
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepo.deleteById(studentId);
		
	}

}
