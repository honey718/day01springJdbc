package com.offcn.service;

import com.offcn.bean.Student;
import com.offcn.dao.Studentdao;
import com.offcn.dao.StudentdaojdbcImbl;

public class StudentserviceImpl  implements StudentService {
    private Studentdao studentdao ;



    public Studentdao getStudentdao() {
        return studentdao;
    }

    public void setStudentdao(Studentdao studentdao) {
        this.studentdao = studentdao;
    }

    @Override
    public void  addStudent(Student stu) {
    studentdao.insertStudent(stu);
    }
}
