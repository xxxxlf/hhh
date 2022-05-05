package myByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_3 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1=new FileInputStream("C:\\Users\\小曹的小辛\\Pictures\\Camera Roll\\微信图片_20210628145101.jpg");
        FileOutputStream f2=new FileOutputStream("c:\\hhhh\\def.jpg");
        byte[] bys=new byte[1024];
        int len;
        while((len=f1.read(bys))!=-1){
            f2.write(bys,0,len);
        }
        f1.close();
        f2.close();
    }
}
