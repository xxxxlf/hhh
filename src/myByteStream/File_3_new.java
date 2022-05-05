package myByteStream;

import java.io.*;

public class File_3_new {
    public static void main(String[] args) throws IOException {
        BufferedInputStream f1=new BufferedInputStream(new FileInputStream("C:\\Users\\小曹的小辛\\Pictures\\Camera Roll\\微信图片_20210628145101.jpg"));
        BufferedOutputStream f2=new BufferedOutputStream(new FileOutputStream("c:\\hhhh\\hij.jpg"));
        byte[] bys=new byte[1024];
        int len;
        while ((len=f1.read(bys))!=-1){
            f2.write(bys,0,len);
        }
        f1.close();
        f2.close();
    }
}
