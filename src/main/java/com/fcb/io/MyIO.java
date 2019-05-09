package com.fcb.io;

import java.io.*;
import java.util.Scanner;

/**
 * @Author: Fcb
 * @Date: 2019/5/9
 * @Description:
 */
public class MyIO {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(i);
//
//        File file = new File("");
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        //缓冲区
        byte[] buffer = new byte[1024];
        try {
            fileInputStream = new FileInputStream("src/main/resources/io.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fileOutputStream = new FileOutputStream("src/main/resources/out.txt");
        int i;
        while ((i = fileInputStream.read(buffer)) > 0){
            System.out.print(new String(buffer));
            fileOutputStream.write(buffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

}
