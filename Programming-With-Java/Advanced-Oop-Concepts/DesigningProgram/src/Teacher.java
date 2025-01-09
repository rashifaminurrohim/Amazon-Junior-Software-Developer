public class Teacher extends Employee{
    private String qualification;
    String subject;

    public Teacher(String name, Date dob, Date doa, String qualification, String subject) {
        this.name = name;
        this.dob = dob;
        this.setDateOfAppointment(doa);
        this.qualification = qualification;
        this.subject = subject;
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.getDateOfAppointment().getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }
}
