package com.athensoft.networking.activity4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) {
        try {
            System.out.println("Server listening at 8189");
            // establish server socket
            ServerSocket s = new ServerSocket(8189);

            boolean flag = true;

            while(flag){
                Socket  incoming = s.accept();
                try {


                    InputStream inStream = incoming.getInputStream();
                    OutputStream outStream = incoming.getOutputStream();

                    Scanner in = new Scanner(inStream);
                    PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);

                    out.println("Hello! Enter BYE to exit.");

                    // echo client input
                    boolean done = false;

                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.trim().equals("BYE")) {
                            done = true;
                        }
                    }

                } finally {
                    incoming.close();
                }
            }
            // wait for client connection
            Socket incoming = s.accept();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
