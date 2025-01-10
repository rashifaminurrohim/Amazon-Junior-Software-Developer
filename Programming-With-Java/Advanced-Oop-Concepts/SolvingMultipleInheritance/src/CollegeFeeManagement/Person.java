package CollegeFeeManagement;

abstract class Person {
    //TODO 1: declare CollegeFeeManagement.Person attributes name and age here
    String name;
    int age;


    void getDetails() {
        //TODO 2: print name and age
        System.out.println("name = " + name + '\n' +
                "age = " + age);
    }
}