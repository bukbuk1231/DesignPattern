package avgCalculator;

import java.util.List;

public class AvgCalculatorA4E6DropLowest implements AvgCalculator {

    private List<Double> assignments, exams;

    public void setAssignments(List<Double> assignments) {
        this.assignments = assignments;
    }

    public void setExams(List<Double> exams) {
        this.exams = exams;
    }

    public double calculateAvg() {
        double sum = 0, avg = 0, lowest = Double.MAX_VALUE;
        for (double as : assignments) {
            sum += as;
            lowest = Math.min(lowest, as);
        }
        if (assignments.size() >= 2)
            avg = (sum - lowest) / (assignments.size() - 1) * 0.4;
        else if (assignments.size() > 0)
            avg = sum / assignments.size();

        sum = 0;
        for (double es : exams) {
            sum += es;
        }
        if (exams.size() > 0)
            avg += sum / exams.size() * 0.6;
        return avg;
    }
}
