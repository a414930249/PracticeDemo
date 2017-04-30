package com.learning.java.rpc.implementaion;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by ruhr on 2017/4/30.
 */
public class RPCTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8092);
                    serviceServer.register(Service.class, HelloService.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        HelloService service = RPCClient.getRemoteProxyObj(Service.class, new InetSocketAddress("localhost", 8092));
        System.out.println(service.execute("test"));
    }
}
