import gradeTracker.GradeMediator;
import gradeTracker.LetterGradeMediator;
import studentRoster.GradeTracker;
import studentRoster.Student;

public class Main {

    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();
        Student student = new Student("Derek");
        GradeMediator gradeMediator = new LetterGradeMediator();
        gradeMediator.setGradeTracker(gradeTracker);
        gradeMediator.setStudent(student);
        student.setGradeMediator(gradeMediator);
        gradeTracker.setGradeMediator(gradeMediator);

        student.addAssignmentScore(90.0);
        student.addAssignmentScore(90.0);
        student.addAssignmentScore(90.0);
        student.addExamScore(90.0);
        student.addExamScore(90.0);

        System.out.println("Grade for " + student.getName() + " is: " + gradeTracker.getGrade());

        student.addAssignmentScore(65.0);
        System.out.println("Grade for " + student.getName() + " is: " + gradeTracker.getGrade());
    }
}
