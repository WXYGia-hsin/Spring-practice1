package com.wang.B;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/9 0009.
 */
@Component
public class Cat {
    public String cat(){
        System.out.println("可爱的小猫");
        return "都喜欢";
    }
}
