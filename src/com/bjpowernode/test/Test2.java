package com.bjpowernode.test;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;
import com.bjpowernode.vo.StudentClass;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        StudentDao dao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
        ArrayList<StudentClass> studentClasses = dao.selectStudentClassByVo("g");
        for(StudentClass studentClass : studentClasses){
            System.out.println(studentClass);
        }
    }
}
