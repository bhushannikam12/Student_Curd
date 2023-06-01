package com.demo.Service;

import java.util.List;

import com.demo.Entity.Student;


public interface StudentService {

    Student getStudentById(int StudentId);

    Student addStudent(Student Student);

    Student updateStudent(int StudentId, Student Student);

    void deleteStudent(int StudentId);

}
