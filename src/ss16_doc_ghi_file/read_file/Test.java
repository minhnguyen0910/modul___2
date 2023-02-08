package ss16_doc_ghi_file.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    static List<Country> countryList = new ArrayList<>();

    public static List<Country> read() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss16_doc_ghi_file\\doc_file\\Test.java");
            bufferedReader = new BufferedReader(fileReader);
            String list;
            String[] temp;
            Country country;
            while ((list = bufferedReader.readLine()) != null) {
                temp = list.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                country = new Country(id, code, name);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            bufferedReader.close();
        }
        return countryList;
    }

    public static void write(List<Country> countryList) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\ss16_doc_ghi_file\\doc_file\\countryfile.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Country i : countryList) {
            bufferedWriter.write(i.getId() + "," + i.getCode() + "," + i.getName() + "\n");
        }
        bufferedWriter.close();

    }

    public static void main(String[] args) {
        Country country1 = new Country(1, "a", "A");
        Country country2 = new Country(2, "b", "B");
        Country country3 = new Country(3, "c", "C");
        Country country4 = new Country(4, "d", "D");

        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        countryList.add(country4);
        try {
            write(countryList);
            System.out.println("successful");
            countryList.add(new Country(5, "e", "E"));
            write(countryList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
