package studentRoster;

import gradeTracker.GradeMediator;

public class GradeTracker {

    private GradeMediator gradeMediator;
    private String grade;

    public void setGradeMediator(GradeMediator gradeMediator) {
        this.gradeMediator = gradeMediator;
    }

    public void updateGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
