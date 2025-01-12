package ConcreteAbstractAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO 8: declare and initialize the object of ClassroomCourse class
        //TODO 9: declare and initialize the Learner object

        //TODO 18: display course list and accept user choice
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("--COURSES AVAILABLE--");
        System.out.println("1. Java");
        System.out.println("2. Java Online");
        System.out.println("3. JavaScript");
        System.out.println("4. JavaScript Online");
        System.out.print("Enter course code: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                Subject java = new Subject("Java", 3.0);

                ClassroomCourse classroomCourse = new ClassroomCourse(java,"Jasman Pardede", 5000, "Itenas", "Offline");

                Learner learnerJava= new Learner(name, classroomCourse);
                learnerJava.setName(name);

                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                classroomCourse.setAssignmentMarks(scanner.nextInt());

                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                classroomCourse.setQuizMarks(scanner.nextInt());

                learnerJava.setGradeScore(learnerJava.calculateGrade(classroomCourse));
                System.out.println("Grade Score: " + learnerJava.getGradeScore());

                if (learnerJava.getGradeScore() >= 5) {
                    System.out.println("Congratulations " + name + " you have successfully passed the " + java.title + " course");
                } else {
                    System.out.println("Unfortunately you didn't pass " + java.title + " course");
                }
                break;
            case 2:
                Subject javaOnline = new Subject("Java Online", 3.0);

                OnlineCourse onlineCourse = new OnlineCourse(javaOnline, "Jasman Pardede", 5000, "zoom", "wednesday");

                Learner learnerJavaOnline = new Learner(name, onlineCourse);

                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                onlineCourse.setAssignmentMarks(scanner.nextInt());

                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                onlineCourse.setQuizMarks(scanner.nextInt());

                learnerJavaOnline.setGradeScore(learnerJavaOnline.calculateGrade(onlineCourse));
                System.out.println("Grade Score: " + learnerJavaOnline.getGradeScore());
                if (learnerJavaOnline.getGradeScore() >= 5) {
                    System.out.println("Congratulations " + name + " you have successfully passed the " + javaOnline.title + " course");
                } else {
                    System.out.println("Unfortunately you didn't pass " + javaOnline.title + " course");
                }
                break;
            case 3:
                Subject javaScript = new Subject("JavaScript", 3.0);

                ClassroomCourse classroomJavaScriptCourse = new ClassroomCourse(javaScript,"Jasman Pardede", 5000, "Itenas", "Offline");

                Learner learnerJavaScript = new Learner(name, classroomJavaScriptCourse);

                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                classroomJavaScriptCourse.setAssignmentMarks(scanner.nextInt());

                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                classroomJavaScriptCourse.setQuizMarks(scanner.nextInt());

                learnerJavaScript.setGradeScore(learnerJavaScript.calculateGrade(classroomJavaScriptCourse));
                System.out.println("Grade Score: " + learnerJavaScript.getGradeScore());

                if (learnerJavaScript.getGradeScore() >= 5) {
                    System.out.println("Congratulations " + name + " you have successfully passed the " + javaScript.title + " course");
                } else {
                    System.out.println("Unfortunately you didn't pass " + javaScript.title + " course");
                }
                break;
            case 4:
                Subject javaScriptOnline = new Subject("Java Script Online", 3.0);

                OnlineCourse onlineJavaScriptCourse = new OnlineCourse(javaScriptOnline, "Jasman Pardede", 5000, "zoom", "wednesday");

                Learner learnerJavaScriptOnline = new Learner(name, onlineJavaScriptCourse);

                System.out.println("Enter assignment marks (max 100 for classroom course, 30 for online course)");
                onlineJavaScriptCourse.setAssignmentMarks(scanner.nextInt());

                System.out.println("Enter quiz marks (max 30 for classroom course, 10 for online course)");
                onlineJavaScriptCourse.setQuizMarks(scanner.nextInt());

                learnerJavaScriptOnline.setGradeScore(learnerJavaScriptOnline.calculateGrade(onlineJavaScriptCourse));
                System.out.println("Grade Score: " + learnerJavaScriptOnline.getGradeScore());

                if (learnerJavaScriptOnline.getGradeScore() >= 5) {
                    System.out.println("Congratulations " + name + " you have successfully passed the " + javaScriptOnline.title + " course");
                } else {
                    System.out.println("Unfortunately you didn't pass " + javaScriptOnline.title + " course");
                }
                break;
            default:
        }
        //TODO 19: initialize object of chose course
        //TODO 20: accept user input for learner's name
        //TODO 21: call assignmentScore() method and quizScore() methods
        //TODO 22: call assignmentScore() method. Display the result as described
    }
}
