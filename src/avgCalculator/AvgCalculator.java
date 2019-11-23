package avgCalculator;

import java.util.List;

public interface AvgCalculator {

    void setAssignments(List<Double> assignments);
    void setExams(List<Double> exams);
    double calculateAvg();

}
