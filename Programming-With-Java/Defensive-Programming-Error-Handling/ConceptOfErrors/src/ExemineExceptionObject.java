public class ExemineExceptionObject {
    public static void main(String[] args) {
        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        int[] array = {1,2,3,4,5};
//        System.out.println(array[5]);
//        System.out.println("Some more code");

        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to access an element that's out of the index boundary");
        }

        System.out.println("Some more code");

//        try {
//
//            // Code that may cause an exception
//
//        } catch (Exception_Type e) {
//            // Code that handles the exception
//        } catch (Exception_Type e) {
//            // Code that handles the exception
//        }

    }
}
