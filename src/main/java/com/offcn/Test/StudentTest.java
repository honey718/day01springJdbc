package com.offcn.Test;

import com.offcn.bean.Student;
import com.offcn.service.StudentService;
import com.offcn.service.StudentserviceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    /*
    * 依赖注入
    * 可以说是控制反转的另一种方式；
    * 依赖关系的注入（依赖对象的注入）
    *
    * 依赖关系： 类与类之间的关系
    * 1：关联关系    A类中  有B类的成员变量，A类和B类是关联关系------也是依赖关系
    *                    class B {
    *                            }
    *                    class A {
    *                          B  }
    *2：依赖关系     A 类中的某个方法中（包括局部变量和方法的参数）用到了B类，A类依赖B类；
    *
    * 3： 一般关系（继承关系）
    *
    *
    * 从广义上说，关联关系和依赖关系都可以看成是依赖关系！！！！
    *
    * spring的依赖注入也是指广义的依赖关系；
    *
    * 类中的依赖关系不是自己new 的，而是由spring负责注入的！！！
    * 怎么注入的？
    * 在applicationContext.xml配置的；
    * */


    @Test
    public void test3(){
        Student stu = new Student();
        stu.setId(1);
        stu.setName("张三");
        stu.setAge(20);
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentservice = (StudentserviceImpl)ac.getBean("studentService");
        studentservice.addStudent(stu);

    }

    //spring 默认使用无参的构造方法创建对象，如果给了
    //有参的构造，就会报错；
    /*
    * IOC 控制反转
    * 所谓控制反转是指对象及控制权的转移；
    * 在不使用IOC时对象的创建是使用应用程序负责（程序员---自己new）；
    * 而使用了spring框架时，对象的创建交给了spring（生命周期的管理也交给了spring）；
    * 这种对象控制权的转移就叫做反转；
    *
    * DI  依赖注入（可以说是控制反转的另一种方式）
    * 可以理解为DI也是控制反转；
    *
    * */
    @Test
    public void test2(){         //使用spring
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       Student stu = (Student) ac.getBean("stu",Student.class);
        System.out.println(stu);
    }



    @Test
    public void test1(){
        Student stu = new Student();
        stu.getClass();
        stu.setId(1);
        stu.setName("张三");
        stu.setAge(20);
        System.out.println(stu.getClass());
    }
}
