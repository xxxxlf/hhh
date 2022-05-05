package myByteStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_1{
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\hhhh\\abc.txt");
        FileOutputStream f2=new FileOutputStream(f1);
//        f2.write(97);
//        f2.close();
        byte[] a={101,102,103,104,105,106,107,108,109};
        f2.write(a,2,4);
        f2.close();
    }
}
