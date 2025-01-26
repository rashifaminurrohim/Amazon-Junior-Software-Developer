package WritingDifferentFileTypesLab;

public class Person {
    //TODO 1: declare instance variables
    String name;
    int age;
    float weight;

    public Person(String name, int age, float weight) {
        //TODO 2: complete the constructor
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        //TODO 3: use the String.format() method to return string representation of the object
        return String.format("Hello, my name is %s, my age is %d, my weight is %.2f%n", this.name, this.age, this.weight);
    }
}

