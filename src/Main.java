import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int b = 5;

        System.out.println(factorial(b));
    }

    public static int factorial(int n) {
        int result = 1;
        if (n == 1) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}