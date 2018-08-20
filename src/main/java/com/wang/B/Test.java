package com.wang.B;

import com.sun.glass.ui.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * Created by Administrator on 2018/5/9 0009.
 */

public class Test {
    public static void main(String[] args) {
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("beans1.xml");
        Cat cat=(Cat)appletContext.getBean("cat");
        cat.cat();
    }
}
