package com.learning.java.serialize.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ruhr on 2017/4/28.
 */
public class NameTest {
    public static void main(String[] args) throws Exception{
        Name name = new Name("1", "2", "3");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/data/b.ser"));
        out.writeObject(name);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/data/b.ser"));
        Name name2 = (Name) in.readObject();
        System.out.println(name2);
    }
}
