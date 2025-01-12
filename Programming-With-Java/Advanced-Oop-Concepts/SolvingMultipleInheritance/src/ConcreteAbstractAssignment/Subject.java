package ConcreteAbstractAssignment;

class Subject {

    String title;
    double credits;

    public Subject(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                '}';
    }
}
