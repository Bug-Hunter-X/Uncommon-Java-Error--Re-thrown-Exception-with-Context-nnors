public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            // Re-throwing the exception with additional context
            throw new RuntimeException("An error occurred during calculation:", e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}