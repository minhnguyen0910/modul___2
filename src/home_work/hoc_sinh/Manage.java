package home_work.hoc_sinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Students> studentRecordsArrayList = new ArrayList<>();

    public void add() {
        System.out.println("nhap so hoc sinh");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("ten");
            String name = scanner.nextLine();
            System.out.println("tuoi");
            int ages = Integer.parseInt(scanner.nextLine());
            System.out.println("nam sinh");
            int years = Integer.parseInt(scanner.nextLine());
            System.out.println("dia chi");
            String homeTown = scanner.nextLine();
            System.out.println("lop");
            String classs = scanner.nextLine();
            System.out.println("khoa hoc");
            String course = scanner.nextLine();
            System.out.println("hoc ki");
            int semester = Integer.parseInt(scanner.nextLine());
            Students studentRecords = new StudentRecords(name, ages, homeTown, years, classs, course, semester);
            studentRecordsArrayList.add(studentRecords);
        }
    }

    public void disPlay1985() {
        for (Students students : studentRecordsArrayList) {
            if (students.getYearOfBirth() == 1985) {
                System.out.println(students.getName());
            }
        }
    }

    public void count() {
        for (Students students : studentRecordsArrayList) {
            if (students.getYearOfBirth() == 1985 && students.getHomeTown().equals("Thai Binh")) {
                System.out.println(students.getName());
            }
        }
    }
}
