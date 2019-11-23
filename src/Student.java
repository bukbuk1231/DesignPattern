import java.util.*;

public class Student {

    private String name;
    private List<Double> assignments, exams;

    public Student(String name) {
        this.name = name;
        assignments = new ArrayList<>();
        exams = new ArrayList<>();
    }

    public void addAssignmentScore(double as) {
        assignments.add(as);
    }

    public void addExamScore(double es) {
        exams.add(es);
    }

    public double getClassAvg(String method) {
        AvgCalculator ac = AvgCaclulatorFactory.getAvgCalculator(method);
        ac.setAssignments(assignments);
        ac.setExams(exams);
        double avg = ac.calculateAvg();
        System.out.println("Class Average for " + name + " using Calculating method " + method + " is: " + avg);
        return avg;
    }
}
