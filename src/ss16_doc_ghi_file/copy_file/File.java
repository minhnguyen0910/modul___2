package ss16_doc_ghi_file.copy_file;

import java.io.*;

public class File {
    public static void copyFile(String fileSource, String fileTarget) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader(fileSource);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(fileTarget);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) throws IOException {
//        System.out.println("nhap duong truyen file nguon");
        String fileSource = "C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss16_doc_ghi_file\\copy_file\\source.csv";
//        System.out.println("nhap duong truyen file target");
        String fileTarget = "C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss16_doc_ghi_file\\copy_file\\targetfile.csv";
        copyFile(fileSource, fileTarget);
    }
}
