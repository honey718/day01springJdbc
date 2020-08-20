package com.offcn.dao;

import com.offcn.bean.Student;

public class StudentDaoMybatisImpl implements Studentdao {

    @Override
    public void insertStudent(Student stu) {
        System.out.println("Mybatis实现的dao层");
        System.out.println(stu);
    }
}
