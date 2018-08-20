package com.wang.A;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/5/7 0007.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        MathTeacher t=(MathTeacher)applicationContext.getBean("mathTeacher");
        t.speaking();
        ChineseTeacher chineseTeacher=(ChineseTeacher)applicationContext.getBean("chineseTeacher");
        chineseTeacher.speaking();
        Student student=(Student) applicationContext.getBean("student");
        student.liston();
        System.out.println(student);


    }
}
