package myByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_2 {
    public static void main(String[] args) throws IOException {
        File f2=new File("c:\\hhhh\\abc.txt");
        FileInputStream f1=new FileInputStream(f2);
        FileInputStream f3=new FileInputStream("c:\\hhhh\\abc.txt");
        System.out.println((char) f1.read());
        System.out.println(f3.read());
        f1.close();
        f3.close();
    }
}
