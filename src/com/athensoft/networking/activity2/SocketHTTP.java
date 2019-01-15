package com.athensoft.networking.activity2;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 *prog 3-2. SocketTest.java
 */
public class SocketHTTP {
    public static void main(String[] args) {
        {
            try {
//                Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
                Socket s = new Socket();
                s.connect(new InetSocketAddress("athensoft.com",80),10000);

                try {
                    InputStream inStream = s.getInputStream();
                    Scanner in = new Scanner(inStream);

                    while (in.hasNextLine()) {
                        String line = in.nextLine();
                        System.out.println(line);
                    }
                } finally {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
