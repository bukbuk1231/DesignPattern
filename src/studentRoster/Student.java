package studentRoster;

import avgCalculator.AvgCaclulatorFactory;
import avgCalculator.AvgCalculator;
import gradeTracker.GradeMediator;

import java.util.*;

public class Student {

    private String name;
    private List<Double> assignments, exams;
    private GradeMediator gradeMediator;

    public Student(String name) {
        this.name = name;
        assignments = new ArrayList<>();
        exams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setGradeMediator(GradeMediator gradeMediator) {
        this.gradeMediator = gradeMediator;
    }

    public void addAssignmentScore(double as) {
        assignments.add(as);
        // gradeMediator.updateGrade(getClassAvg("A4E6"));
    }

    public void addExamScore(double es) {
        exams.add(es);
        // gradeMediator.updateGrade(getClassAvg("A4E6"));
    }

    public double getClassAvg(String method) {
        AvgCalculator ac = AvgCaclulatorFactory.getAvgCalculator(method);
        ac.setAssignments(assignments);
        ac.setExams(exams);
        double avg = ac.calculateAvg();
        // System.out.println("Class Average for " + name + " using Calculating method " + method + " is: " + avg);
        return avg;
    }
}
