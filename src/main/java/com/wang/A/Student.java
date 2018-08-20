package com.wang.A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/7 0007.
 */
@Component()
public class Student {


    @Autowired
    @Value("tom")
    private String name;
    @Autowired
    @Value("22")
    private int age;
    private Teacher teacher;
    @Autowired
    private MathTeacher mathTeacher;
    @Autowired
    private ChineseTeacher chineseTeacher;
    public  void  liston(){
        System.out.print("我有");
        this.mathTeacher.speaking();
        this.chineseTeacher.speaking();
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


}
