package ConcreteAbstractAssignment;

class ClassroomCourse extends Course  {
    //TODO 6: add instance variables
    private String school;
    private String session;

    ClassroomCourse(Subject subject, String instructor, int fee,
                    String school, String session) {
        //TODO 7: call superclass constructor
        //complete constructor code
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }
}
