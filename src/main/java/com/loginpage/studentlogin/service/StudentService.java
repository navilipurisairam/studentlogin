package com.loginpage.studentlogin.service;

import com.loginpage.studentlogin.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
