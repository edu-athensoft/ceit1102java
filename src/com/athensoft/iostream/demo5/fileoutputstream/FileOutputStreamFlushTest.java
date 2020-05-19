package com.athensoft.iostream.demo5.fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamFlushTest {
	public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        String data = "Demo of flush() method";
        try {
            out = new FileOutputStream(".\\src\\com\\athensoft\\iostream\\demo5\\fileoutputstream\\output-flush.txt");
            // Using write() method
            out.write(data.getBytes());
            // Using the flush() method
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

}
