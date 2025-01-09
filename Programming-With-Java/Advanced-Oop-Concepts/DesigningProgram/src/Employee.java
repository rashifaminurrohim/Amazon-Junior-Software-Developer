abstract class Employee extends Person {
    private Date dateOfAppointment;
    private int salary;

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }
}
