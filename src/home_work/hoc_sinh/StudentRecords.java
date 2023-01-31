package home_work.hoc_sinh;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRecords extends Students {
    String classs;
    String course;
    int semester;

    public StudentRecords(String name, int ages, String homeTown, int yearOfBirth, String classs, String course, int semester) {
        super(name, ages, homeTown, yearOfBirth);
        this.classs = classs;
        this.course = course;
        this.semester = semester;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
