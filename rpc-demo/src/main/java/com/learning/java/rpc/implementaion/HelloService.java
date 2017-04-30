package com.learning.java.rpc.implementaion;

/**
 * Created by ruhr on 2017/4/30.
 */
public class HelloService implements Service {
    public String execute(String str) {
        return "hello: "+ str;
    }
}
