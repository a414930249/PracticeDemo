package com.learning.java.serialize.demo;

import java.io.*;

/**
 * Created by ruhr on 2017/4/28.
 */
public class SerTest {
    public static void main(String[] args) throws Exception {
        Foo foo = new Foo(1,2);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/data/a.ser"));
        out.writeObject(foo);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/data/a.ser"));
        Foo foo1 = (Foo) in.readObject();
        System.out.println(foo1.getX());

    }
}
