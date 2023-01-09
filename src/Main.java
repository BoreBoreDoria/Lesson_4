import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        float a = 15;
        float b = 6;
        char symbol = '/';

        calc(a, b, '+');
        calc(a, b, '-');
        calc(a, b, '/');
        calc(a, b, '*');
        calc(a, b, 'а');
    }

    private static void calc(float a, float b, char symbol) {
        if (symbol == '+') {
            System.out.println("Сумма = " + (a + b));
        } else if (symbol == '-') {
            System.out.println("Разница = " + (a - b));
        } else if (symbol == '*') {
            System.out.println("Произедение = " + (a * b));
        } else if (symbol == '/'){
            System.out.println(a / b);
        } else {
            System.out.println("Неверное выражение");
        }
    }
}