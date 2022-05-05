package myByteStream;

import java.io.*;

public class File_6 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\hm_file");
        String s = new String(f1.getName());
        File f2 = new File("c:\\hhhh", s);
        if (!f2.exists()) {
            f2.mkdir();
        }
        copyFile(f1, f2);
    }

    public static void copyFile(File f1, File f2) throws IOException {
        if (!f1.isDirectory()) {
            //如果不是文件夹就直接用字节流的方式复制
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
            byte[] a = new byte[1024];
            int len;
            while ((len = bis.read(a)) != -1) {
                bos.write(a, 0, len);
            }
            bis.close();
            bos.close();
        } else {
//            复制文件夹的情况
            File[] f = f1.listFiles();
            for (File f3 : f) {
                //查看文件夹中的文件是否为文件夹
                if (f3.isDirectory()) {
                    //如果是
                    String s1 = f3.getName();
                    File f4 = new File(f2, s1);
//                在目的地文件夹中创建与已知同名的文件夹
                    if (!f4.exists()) {
                        f4.mkdir();
                    }
//                递归调用复制文件夹操作
                    copyFile(f3, f4);
                } else {
                    String s1 = f3.getName();
                    File f4 = new File(f2, s1);
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f3));
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f4));
                    byte[] a = new byte[1024];
                    int len;
                    while ((len = bis.read(a)) != -1) {
                        bos.write(a, 0, len);
                    }
                    bis.close();
                    bos.close();
                }
            }
        }
    }
}

