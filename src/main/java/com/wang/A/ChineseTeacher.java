package com.wang.A;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/7 0007.
 */
@Component
public class ChineseTeacher implements Teacher{
    @Override
    public void speaking() {
        System.out.println("语文课");
    }
}
