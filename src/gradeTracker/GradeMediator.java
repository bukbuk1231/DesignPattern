package gradeTracker;

import studentRoster.GradeTracker;
import studentRoster.Student;

public interface GradeMediator {

    void setStudent(Student student);
    void setGradeTracker(GradeTracker gradeTracker);
    void updateGrade(double avg);

}
