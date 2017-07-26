package com.learning.java.spring.introAdvice.implementation;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by ruhr on 2017/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Enhancer en = new Enhancer();
        en.setSuperclass(AService.class);
        en.setInterfaces(new Class[] { IHello.class });
        en.setCallback(new IntroIntercepter());

        AService cs = (AService) en.create();
        cs.doService();

        IHello ih = (IHello) cs;
        ih.sayHello();

    }
}
