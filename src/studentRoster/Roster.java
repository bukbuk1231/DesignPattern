package studentRoster;

import java.util.*;

public class Roster {

    private String name;
    private String number;
    private List<Student> students;

    public Roster(String name, String number) {
        this.name = name;
        this.number = number;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
