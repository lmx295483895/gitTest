package com.bjpowernode.service;

import com.bjpowernode.dao.StudentDao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;


import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
    @Override
    public Student selectStudentById(String id) {
        return dao.selectStudentById(id);
    }

    @Override
    public int insertStudent(Student student) {
        return dao.insertStudent(student);
    }

    @Override
    public List<Student> findAll() {
        ArrayList<Student> students = dao.selectAll();
        return students;
    }
}
