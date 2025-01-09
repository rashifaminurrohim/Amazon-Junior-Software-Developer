public class Student extends Person {
    private Teacher teacher;
    private String subject;

    public Student(String name, Date dob, Teacher teacher, String subject) {
        this.name = name;
        this.dob = dob;
        this.teacher = teacher;
        this.subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("Name of Student: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.name);
    }
}
