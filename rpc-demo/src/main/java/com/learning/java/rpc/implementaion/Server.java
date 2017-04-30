package com.learning.java.rpc.implementaion;

import java.io.IOException;

/**
 * Created by ruhr on 2017/4/30.
 */
public interface Server { //服务中心
    public void stop();
    public void start() throws IOException;
    public void register(Class serviceInterface, Class impl);
    public boolean isRunning();
    public int getPort();

}
