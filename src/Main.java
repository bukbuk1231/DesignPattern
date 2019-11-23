import avgAccessor.AvgDispenser;
import gradeTracker.GradeMediator;
import gradeTracker.LetterGradeMediator;
import studentRoster.GradeTracker;
import studentRoster.Roster;
import studentRoster.Student;

public class Main {

    public static void main(String[] args) {
        Student derek = new Student("Derek");
        Student mark = new Student("Mark");
        derek.addAssignmentScore(90.0);
        mark.addExamScore(80.0);
        Roster se = new Roster("Software Engineering", "5800");
        se.addStudent(derek);
        se.addStudent(mark);

        int cnt = 1;
        AvgDispenser ad = se.avgDispenser();
        while (ad.hasNextAvg()) {
            System.out.println("Student " + cnt++ + " has average: " + ad.nextAvg());
        }

    }
}
