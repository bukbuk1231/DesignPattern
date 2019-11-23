package gradeTracker;

import studentRoster.GradeTracker;
import studentRoster.Student;

public class LetterGradeMediator implements GradeMediator {

    private Student student;
    private GradeTracker gradeTracker;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setGradeTracker(GradeTracker gradeTracker) {
        this.gradeTracker = gradeTracker;
    }

    public void updateGrade(double avg) {
        String grade = "F";
        if (avg >= 90.0) {
            grade = "A";
        } else if (avg >= 80.0) {
            grade = "B";
        } else if (avg >= 70.0) {
            grade = "C";
        } else if (avg >= 60.0) {
            grade = "D";
        }
        gradeTracker.updateGrade(grade);
    }
}
