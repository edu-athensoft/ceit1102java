package com.athensoft.networking.activity4;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        try {
            String serverName = "localhost";
            int port = 8189;
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket s = new Socket(serverName, port);
            try {
                System.out.println("Just connected to " + s.getRemoteSocketAddress());
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
