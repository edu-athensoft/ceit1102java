package com.athensoft.networking.activity4;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class GreetingClient {

    public static void main(String [] args) throws IOException {
        String serverName = "localhost";
        int port = Integer.parseInt("8190");

        try {
            //while(true) {
                Socket client = new Socket(serverName, port);
                System.out.println("Connecting to " + serverName + " on port " + port);


                System.out.println("Just connected to " + client.getRemoteSocketAddress());
                OutputStream outToServer = client.getOutputStream();
                DataOutputStream out = new DataOutputStream(outToServer);

                Scanner myinput = new Scanner(System.in);
                String strMyinput = "";
                strMyinput = myinput.nextLine();

                myinput.close();

//            System.out.println(">> local input = "+strMyinput);

                out.writeUTF("Hello from " + client.getLocalSocketAddress() + "  " + strMyinput);
                //out.writeUTF(strMyinput);

                InputStream inFromServer = client.getInputStream();
                DataInputStream in = new DataInputStream(inFromServer);

                System.out.println("Server says " + in.readUTF());
                client.close();
           // }




        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
