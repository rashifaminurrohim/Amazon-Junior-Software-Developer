package CollegeFeeManagement;

public class Main {
    public static void main(String[] args) {
        //TODO 15: instantiate CollegeFeeManagement.Student class
        Student student = new Student("Rashif", 21, "Informatics", 98);
        student.getDetails();
        //TODO 16: call result() and fee() methods
        student.result();
        student.fee(5000);
        //TODO 17: declare object of CollegeFeeManagement.Employee class
        Employee employee = new Employee("Steve", 35, 50000 );
        employee.getDetails();
        //TODO 18: call computeSalary() and computeTax() methods
        employee.computeSalary();
        employee.computeTax();
    }
}