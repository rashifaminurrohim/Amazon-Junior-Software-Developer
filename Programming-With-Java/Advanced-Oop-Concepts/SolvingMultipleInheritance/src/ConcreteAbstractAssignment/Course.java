package ConcreteAbstractAssignment;

abstract class Course{
    //TODO 3: include instance variables for Course class and complete constructor code
    Subject subject;
    String instructor;
    int fee;
    private int assignmentMarks;
    private int quizMarks;
    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
    }

    public int getAssignmentMarks() {
        return assignmentMarks;
    }

    public void setAssignmentMarks(int assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public int getQuizMarks() {
        return quizMarks;
    }

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }
}
