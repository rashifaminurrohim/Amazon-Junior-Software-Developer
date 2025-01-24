package HandlingUncheckedException;

public class UncheckedExceptions {
    public static void main(String[] args) {
        // java.lang.NullPointerException
        try {
            Student student = new Student();
            System.out.println("Name: " + student.toString());
        } catch (NullPointerException e) {
            System.out.println("Error attempted to fetch a null item reference " + e.getMessage());
        }

        try {
            Item[] items = new Item[2];
            items[0] = new Item("Pen", 12);
            items[1] = new Item("Pencil", 10);
            int index = 3;
            System.out.println("Name: " + items[index].toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error the give index is out of bounds " + e.getMessage());
        }


    }
}
