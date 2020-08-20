package com.offcn.dao;

import com.offcn.bean.Student;

public class StudentdaojdbcImbl implements Studentdao {
    @Override
    public void insertStudent(Student stu) {
        System.out.println("jdbc方式的数据库操作");
        System.out.println(stu);
    }
}
