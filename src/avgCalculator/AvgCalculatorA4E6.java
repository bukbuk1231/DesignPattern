package avgCalculator;

import java.util.List;

public class AvgCalculatorA4E6 implements AvgCalculator {

    private List<Double> assignments;
    private List<Double> exams;

    public void setAssignments(List<Double> assignments) {
        this.assignments = assignments;
    }

    public void setExams(List<Double> exams) {
        this.exams = exams;
    }

    public double calculateAvg() {
        double sum = 0, avg = 0;
        for (double as : assignments) {
            sum += as;
        }
        avg = sum / assignments.size() * 0.4;
        sum = 0;
        for (double es : exams) {
            sum += es;
        }
        avg += sum / exams.size() * 0.6;
        return avg;
    }
}
