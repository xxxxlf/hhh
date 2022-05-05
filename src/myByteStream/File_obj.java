package myByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class File_obj {
    public static void main(String[] args) throws IOException {

        Student xlf = new Student("xlf", 19);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\hhhh\\xlf.txt"));
        oos.writeObject(xlf);
        oos.close();
    }
}
