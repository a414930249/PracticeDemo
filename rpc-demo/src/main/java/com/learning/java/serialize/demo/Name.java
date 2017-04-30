package com.learning.java.serialize.demo;

import java.io.Serializable;

/**
 * the default serializable
 * Created by ruhr on 2017/4/28.
 */
public class Name implements Serializable{
    /**
     * LastName must be not null
     * @serial
     */
    private final String lastName;

    /**
     * firstName must be not null
     * @serial
     */
    private final String firstName;
    /**
     * Middle name, or null if there is none.
     * @serial
     */
    private final String middleName;
    public  Name(String a, String b, String c){
        lastName = a;
        firstName = b;
        middleName = c;
    }

    @Override
    public String toString() {
        return "[ " + lastName + ", " + middleName+", " + firstName+" 】";
    }
}
