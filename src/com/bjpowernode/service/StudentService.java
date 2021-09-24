package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentService {
    Student selectStudentById(String id);
    int insertStudent(Student student);
    List<Student> findAll();
}
