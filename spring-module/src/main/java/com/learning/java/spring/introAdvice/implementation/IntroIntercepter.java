package com.learning.java.spring.introAdvice.implementation;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ruhr on 2017/6/15.
 */
public class IntroIntercepter implements MethodInterceptor,IHello {

    private Object delegate;

    public IntroIntercepter(Object delegate) {
        this.delegate = delegate;


    }

    public IntroIntercepter() {
        this.delegate = this;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Class<?> clz = method.getDeclaringClass();
        if (clz.isAssignableFrom(IHello.class)) {
            // 如果实现了IHello增强接口，则调用实现类delegate的方法
            return method.invoke(delegate, args);
        }
        return methodProxy.invokeSuper(obj, args);
    }
}
