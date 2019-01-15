package com.athensoft.networking.activity3;

import java.net.InetAddress;

/**
 * Get all addresses by host name
 * prog 3-2. InetAddressTest.java
 */
public class InetAddressTest {

    public static void main(String[] args) {
        try {
            if (args.length >= 0) {
//                String host = args[0];
                String host = "google.com";
                InetAddress[] addresses = InetAddress.getAllByName(host);
                for (InetAddress a : addresses)
                    System.out.println(a);
            } else {
                InetAddress localHostAddress = InetAddress.getLocalHost();
                System.out.println(localHostAddress);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
