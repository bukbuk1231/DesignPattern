public class Main {

    public static void main(String[] args) {
        Student student = new Student("Derek");
        student.addAssignmentScore(92.0);
        student.addAssignmentScore(78.0);
        student.addAssignmentScore(88.0);
        student.addExamScore(100.0);
        student.addExamScore(50.0);
        student.getClassAvg("A4E6");
        student.getClassAvg("A4E6DropLowest");
    }
}
