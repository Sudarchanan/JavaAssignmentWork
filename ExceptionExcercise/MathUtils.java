package ExceptionExcercise;

public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        
        return fac;
    }
}
