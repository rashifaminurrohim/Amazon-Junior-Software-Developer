package ComparableInterface;

public class Main {
    public static void main(String[] args) {
        Length l1 = new Length(4,5);
        Length l2 = new Length(2, 7);
        int retVal = l1.compareTo(l2);
        if (retVal == 1)
            System.out.println("the first length is larger than the second");
        else
            System.out.println("the first length is less than or equal to the second");
    }
}
