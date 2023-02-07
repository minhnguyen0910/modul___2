package ss17_io_binari_serialization.bai_2;

import java.io.*;
import java.util.List;

public class Copy {
    public static void CopyFile() throws IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\product_management\\product.dat");
        System.out.println(file.length());
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\bai_2\\file1.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        List list = (List) objectInputStream.readObject();
        objectOutputStream.writeObject(list);
        objectInputStream.close();
        objectOutputStream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CopyFile();
    }
}
