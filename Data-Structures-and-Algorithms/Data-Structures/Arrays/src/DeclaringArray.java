public class DeclaringArray {
    public static void main(String[] args) {

        // declaring an array
        String[] daysOfWeek;
        String weekOfMonth[];

        // Static array initialization

        String[] daysOfWeekStatic = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // can also be done as
        String daysOfWeekStatic2[];
        daysOfWeekStatic2 = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Dynamic array initialization

        String[] daysOfWeekDynamic = new String[7];
        daysOfWeekDynamic[0] = "Monday";
        daysOfWeekDynamic[1] = "Tuesday";
        daysOfWeekDynamic[2] = "Wednesday";
        daysOfWeekDynamic[3] = "Thursday";
        daysOfWeekDynamic[4] = "Friday";
        daysOfWeekDynamic[5] = "Saturday";
        daysOfWeekDynamic[6] = "Sunday";
        // filled array with loop
        for (int i = 0; i < daysOfWeekDynamic.length; i++) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            daysOfWeekDynamic[i] = days[i];
            // Accessing an array with loop
            System.out.println("Element at position " + (i + 1) + ": " + daysOfWeekDynamic[i]);
        }
        // Accessing array through index
        System.out.println("Fourth element: " + daysOfWeekDynamic[3]);

    }
}