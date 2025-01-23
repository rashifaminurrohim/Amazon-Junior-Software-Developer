package ImplementingErrorFreeCodeLab;

public class UseStudent {

    public static void main(String[] args) {
        Student s = null;
        printStudent(s);

        Student[] students = new Student[2];
        Student s1 = new Student("Student1", 20);
        Student s2 = new Student("Student2", 21);
        students[0] = s1;
        students[1] = s2;
        listStudents(students);
    }

    private static void printStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

    private static void listStudents(Student[] students) {
        for (int i = 0; i <= students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getAge());
        }
    }

    private static void thisIsRisky() {

        int priceTag = 50;
        int discount = 0;
        System.out.println("Total = " + (priceTag/discount));

    }

}

