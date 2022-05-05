package myByteStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class File_8 {
    public static void main(String[] args)throws IOException {
        Properties pp=new Properties();
        FileOutputStream f1=new FileOutputStream("c:\\hhhh\\715.txt");
        pp.setProperty("xlf","19");
        pp.setProperty("dby","19");
        pp.setProperty("gq","19");
        pp.setProperty("lqy","19");
        pp.store(f1,null);
        f1.close();
        Properties qq=new Properties();
        FileReader f2=new FileReader("c:\\hhhh\\715.txt");
        qq.load(f2);
        System.out.println(qq);
        f2.close();
    }
}
