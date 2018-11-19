/*package com.company;

import java.io.*;
import java.util.Optional;

public class FileClass {
    public static void main (String [] args) throws Exception{
        Optional<String> f = Optional.of("file1.java");
        System.out.println("f.get" + f.get().getClass());
        File f1 = new File(f.get());

        //1-not working  InputStream iout = new InputStream(f1);
        //2-working InputStream iout = new FileInputStream(f1);
        //3- working FileOutputStream iout = new FileOutputStream(f1);
        //4-working  Reader iout = new FileReader(f1);
        // 5 not working RandomAccessFile iout = new RandomAccessFile(f1);
    }
}
*/