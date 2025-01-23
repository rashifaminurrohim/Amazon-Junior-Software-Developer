public class UsingMultipleException {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[5] = 10/0;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
