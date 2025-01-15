package ConcreteAbstractAssignment.solution.Files;

import ConcreteAbstractAssignment.solution.Files.Course;

class ClassroomCourse extends Course {
    String school;
    String session;
    ClassroomCourse(Subject subject, String instructor, int fee,
                    String school, String session) {
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }


}
