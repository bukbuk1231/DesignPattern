package studentRoster;

import avgAccessor.AvgDispenser;

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

    public AvgDispenser avgDispenser() {
        return new AvgIterator();
    }

    private class AvgIterator implements AvgDispenser {

        private int index;

        AvgIterator() {
            index = 0;
        }

        public boolean hasNextAvg() {
            return index < Roster.this.students.size();
        }

        public double nextAvg() {
            List<Student> students = Roster.this.students;
            return students.get(index++).getClassAvg("A4E6");
        }
    }
}
