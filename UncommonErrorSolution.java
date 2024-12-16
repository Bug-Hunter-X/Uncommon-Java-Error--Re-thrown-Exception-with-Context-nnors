public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Improved error handling: log the exception details and provide a user-friendly message
            System.err.println("Error: Division by zero. Details: " + e.getMessage());
            //Consider using a custom exception for better error handling and reporting
            // throw new CustomException("Division by zero", e);
        }
    }

    // Example of a Custom Exception
    static class CustomException extends Exception {
        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}