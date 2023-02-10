package casetudy.utils;

import casetudy.models.Customer;
import casetudy.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataEmployee {
    public List<Employee> readEmployee() throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\casetudy\\data\\file_of_employee.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Employee> customerList1 = new ArrayList<>();
        String line;
        String[] temp;
        while ((line = bufferedReader.readLine()) != null) {
            temp = line.split(",");
            int employeeCode = Integer.parseInt(temp[0]);
            String level=temp[1];
            String workingPosition=temp[2];
            Double wage=Double.parseDouble(temp[3]);
            String name = temp[4];
            int dayOfBirth = Integer.parseInt(temp[5]);
            String sex = temp[6];
            int identityCardNumber = Integer.parseInt(temp[7]);
            int phoneNumber = Integer.parseInt(temp[8]);
            String email = temp[9];
            customerList1.add(new Employee(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, employeeCode, level,workingPosition,wage));
        }
        bufferedReader.close();
        return customerList1;
    }
    public void writeEmployee(List<Employee> employeeList) throws IOException {
        FileWriter fileWriter= null;
        StringBuilder stringBuilder=new StringBuilder();
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\casetudy\\data\\file_of_employee.csv");
        bufferedWriter= new BufferedWriter(fileWriter);
        for (Employee i: employeeList){
            stringBuilder.append(i);
            stringBuilder.append("\n");
        }
        bufferedWriter.write(String.valueOf(stringBuilder));
        } catch (IOException e) {
            System.out.println("Can not write to file");
        } finally {
            bufferedWriter.close();
        }
    }
}
