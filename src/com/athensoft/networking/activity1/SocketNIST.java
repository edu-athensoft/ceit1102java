package com.athensoft.networking.activity1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * NIST Internet Time Servers
 * https://dns.icoa.cn/ntp/
 * https://tf.nist.gov/tf-cgi/servers.cgi
 * https://www.ntppool.org/en/use.html
 * prog 3-1. SocketTest.java
 */
public class SocketNIST {
    public static void main(String[] args) {
        {
            try {
//                Socket s = new Socket("time-A.timefreq.bldrdoc.gov", 13);
                Socket s = new Socket("time-a-b.nist.gov", 13);
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
