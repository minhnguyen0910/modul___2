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
            String customerType = temp[4];
            String name = temp[5];
            int dayOfBirth = Integer.parseInt(temp[6]);
            String sex = temp[7];
            int identityCardNumber = Integer.parseInt(temp[8]);
            int phoneNumber = Integer.parseInt(temp[9]);
            String email = temp[10];
            customerList1.add(new Employee(name, dayOfBirth, sex, identityCardNumber, phoneNumber, email, employeeCode, level,workingPosition,wage));
        }
        bufferedReader.close();
        return customerList1;
    }
    public void writeEmployee(List<Employee> employeeList){
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\codegym\\modul_2\\src\\casetudy\\data\\file_of_employee.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        for (Employee i: employeeList){
            try {
                bufferedWriter.write(i.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
