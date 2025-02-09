public class OperationsOnArray {
    public static void main(String[] args) {
        // main operation of the array
//        traversal();
//        insertion();
        deletion();

    }

    /** Traversal = The process of going through each element in the array, one by one */
    public static void traversal() {
        /** Traversal = The process of going through each element in the array, one by one */
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thur", "Friday", "Saturday", "Sunday"};
        // Using a for loop
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
        }
    }

    /** Insertion = the process of adding a new element to a specific index (Arrays -> fixed size) */
    public static void insertion() {
        /** Insertion = the process of adding a new element to a specific index (Arrays -> fixed size) */

        // 1. Approach -> Array size unchanged
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thur", "Friday", "Saturday", "Sunday"};
        // Modify and print the day of the week at index 3
        daysOfWeek[3] = "Thursday"; // modify "Thur" to "Thursday"
        System.out.println(daysOfWeek[3]);

        // 2. Approach -> Modify the array size
        String[] monthOfYear = new String[]{"January", "February", "March", "April", "May"};
        String newElement = "June"; // Insert at last position
        String[] tempArray = new String[5]; // New Array for adding the new element
        for (int i = 0; i < tempArray.length; i++) {
            if (i == tempArray.length - 1) {
                tempArray[i] = newElement; // Insert the new element at last
            } else {
                tempArray[i] = monthOfYear[i]; // Copy existing element
            }
            System.out.print(tempArray[i] + " ");
        }
    }

    /** Deletion = The removal of elements from the array. */
    public static void deletion() {
        String[] monthOfYear = new String[]{"January", "February", "March", "April", "May"};
        int indexToDelete = 1; // delete the second element

        System.out.println("");
        System.out.println("Array size unchanged");
        // 1. Approach -> Array size unchanged
        if (indexToDelete >= 0 && indexToDelete < monthOfYear.length) {
            monthOfYear[indexToDelete] = null; // set the element to null
        }
        for(String index : monthOfYear) {
            System.out.println("Element: " + index);
        }

        System.out.println("");
        System.out.println("Modify Array Size");

        // 2. Approach -> Modify the array size
        int originalArraySize = monthOfYear.length;
        // create new array
        String[] newArray = new String[originalArraySize - 1];

        for (int index = 0, i = 0; index < monthOfYear.length; index++) {
            if (index != indexToDelete) {
                newArray[i++] = monthOfYear[index];
            }
        }
        for (String month : newArray) {
            System.out.println("New Array: " + month);
        }

        System.out.println("Original array length: " + monthOfYear.length);
        System.out.println("New array length: " + newArray.length);
    }
}
