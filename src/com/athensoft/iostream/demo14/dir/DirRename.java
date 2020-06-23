package com.athensoft.iostream.demo14.dir;

import java.io.File;

public class DirRename {

	public static void main(String[] args) {
		
		final String PATH_NAME = ".\\src\\com\\athensoft\\iostream\\demo14\\dir\\mydir3\\";
		
		File dir = new File(PATH_NAME+"testDir");
        File newName = new File(PATH_NAME+"newDir");
        if ( dir.isDirectory() ) {
                dir.renameTo(newName);
        } else {
                dir.mkdir();
                dir.renameTo(newName);
        }

	}

}
