public class UncheckedException {
    public static void main(String[] args) {
        // java.lang.ArithmeticException: / by zero
        int number = 100/0;
        // java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
        String name = null;
        System.out.println(name.length());
    }
}
