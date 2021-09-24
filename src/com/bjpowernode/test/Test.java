package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;
import com.bjpowernode.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        StudentService service = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

        ArrayList<Student> result = (ArrayList<Student>) service.findAll();
        for(Student s : result){
            System.out.println(s);
        }
    }
}
