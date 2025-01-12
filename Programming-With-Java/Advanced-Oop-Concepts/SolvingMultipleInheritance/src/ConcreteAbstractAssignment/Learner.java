package ConcreteAbstractAssignment;

//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
    private String name;
    private double grade;
    private Course course;
    private double gradeScore;

    public Learner(String name, Course course) {
        //TODO 2: complete constructor
        this.name = name;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGradeScore() {
        return gradeScore;
    }

    public void setGradeScore(double gradeScore) {
        this.gradeScore = gradeScore;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }


//TODO 13: override assignmentScore() method
    @Override
    public int assignmentScore() {
        int marks;
        marks = course.getAssignmentMarks();
        return marks;
    }

//TODO 14: override quizScore() method
    @Override
    public int quizScore() {
        int marks;
        marks = course.getQuizMarks();
        return marks;
    }

    public double calculateGrade(Course course) {
        double maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions above
        if (course.subject.title.contains("Online")){
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;

            if (assignmentScore() <= maxAssignmentMarks && quizScore() <= maxQuizMarks){
                this.gradeScore = (((assignmentScore()/maxAssignmentMarks)*10) + quizScore())/2;
            }
        } else {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
                this.gradeScore = (((assignmentScore()/maxAssignmentMarks)*10) + ((quizScore()/maxQuizMarks)*10))/2.0;
        }
        return this.gradeScore;
    }
}
