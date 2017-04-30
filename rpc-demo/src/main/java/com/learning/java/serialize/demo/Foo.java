package com.learning.java.serialize.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by ruhr on 2017/4/28.
 */
public class Foo extends AbstractFoo implements Serializable {
    private  void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
        ois.defaultReadObject();
        int x = ois.readInt();
        int y = ois.readInt();
        initialize(x, y);
    }

    private void writeObject(ObjectOutputStream s)
            throws IOException {
        s.defaultWriteObject();
        // Manually serialize superclass state
        s.writeInt(getX());
        s.writeInt(getY());
    }

    public Foo(int x, int y) { super(x, y); }
    private static final long serialVersionUID = 1856835860954L;
}
