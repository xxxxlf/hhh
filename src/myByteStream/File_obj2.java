package myByteStream;

import java.io.*;

public class File_obj2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\hhhh\\xlf.txt"));
        Object obj = ois.readObject();
        Student xlf = (Student) obj;
        System.out.println(xlf.getAge() + "," + xlf.getName());
        ois.close();
//      local class incompatible:stream classdesc serialVersionUID = 2769021246774782453, local class serialVersionUID = 1
//      local class incompatible: stream classdesc serialVersionUID = 2769021246774782453, local class serialVersionUID = -7768595452327068344
//      local class incompatible: stream classdesc serialVersionUID = 2769021246774782453, local class serialVersionUID = -7768595452327068344
    }
}
