package myByteStream;

import java.io.*;

public class File_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader f1=new BufferedReader(new FileReader("C:\\Users\\小曹的小辛\\Pictures\\Camera Roll\\微信图片_20210628145101.jpg"));
        BufferedWriter f2=new BufferedWriter(new FileWriter("c:\\hhhh\\123.jpg"));
        String s;
        while ((s=f1.readLine())!=null){
            f2.write(s);
            f2.newLine();
            f2.flush();
        }
        f1.close();
        f2.close();
    }
}
