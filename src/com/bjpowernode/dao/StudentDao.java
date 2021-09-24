package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    Student selectStudentById(String id);
    int insertStudent(Student student);
    ArrayList<Student> selectAll();
    ArrayList<Student> selectStudentByAge(String pinjie);
    int selectCount();
    ArrayList<Student> selectStudentWhen(Student student);
    int deleteStudentsById(String[] ids);
    List<Map<String,Object>> selectStudentClass();
    ArrayList<StudentClass> selectStudentClassByVo(String name);
}
