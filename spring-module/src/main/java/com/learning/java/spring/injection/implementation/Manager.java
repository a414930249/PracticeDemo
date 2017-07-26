package com.learning.java.spring.injection.implementation;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by ruhr on 2017/6/15.
 */
public class Manager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public void process() {
        command.execute();
        System.out.println(command);
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
