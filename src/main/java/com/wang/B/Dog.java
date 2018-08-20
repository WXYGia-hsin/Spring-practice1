package com.wang.B;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

/**
 * Created by Administrator on 2018/5/9 0009.
 */
@Aspect
@Order(2)
public class Dog {
    @After("execution(* com.wang.B.*.*(..)))")
    public void dog(){
        System.out.println("可爱的小狗");
    }
    @After("execution(* com.wang.B.*.*(..)))")
    public void like(){
        System.out.println("你喜欢哪个？");
    }
    @AfterReturning(value = "execution(* com.wang.B.*.*(..)))",returning = "ret")
    public void reply(String ret){
        System.out.println("都喜欢");
    }
}
