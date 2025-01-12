package ConcreteAbstractAssignment;

class OnlineCourse extends Course  {
    //TODO 15: include videoLessons and weeks attributes
    private String lesson;
    private String weeks;
    OnlineCourse(Subject subject, String instructor, int fee,
                 String lesson, String weeks) {
        super(subject, instructor, fee);
        //TODO 16: initialize other attributes
        this.lesson = lesson;
        this.weeks = weeks;
    }

}
