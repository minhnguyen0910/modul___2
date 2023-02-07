package ss17_io_binari_serialization.copy_file;

import java.io.*;
import java.util.Scanner;

public class File {
    public static void copy() {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            Scanner scanner = new Scanner(System.in);
            java.io.File file = new java.io.File("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\product_management\\product.dat");
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss17_io_binari_serialization\\copy_file\\file1.dat");
            System.out.println("so byte : " + file.length());
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("Copy ok ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inputStream != null;
            assert outputStream != null;
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        copy();
    }
}

