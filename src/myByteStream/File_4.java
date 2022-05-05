package myByteStream;

import java.io.*;

public class File_4 {
    public static void main(String[] args) throws IOException {
        File f1=new File("c:\\hhhh\\abc.txt");
        FileOutputStream f2=new FileOutputStream(f1);
        f2.write(234);
        f2.close();
    }
}
