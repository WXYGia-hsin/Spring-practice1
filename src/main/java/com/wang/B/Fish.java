package com.wang.B;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

/**
 * Created by Administrator on 2018/5/9 0009.
 */
@Aspect
@Order(1)
public class Fish {
    @After("execution(* com.wang.B.*.*(..)))")
    public void fish(){
        System.out.println("小鱼");
    }
}
