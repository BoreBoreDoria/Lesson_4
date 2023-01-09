import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{3, 5, 4, 6, 3, 2, 4, 6, 7, 5, 3, 2, 4, 5, 6};

        System.out.println(Arrays.toString(mas));

//        Main.toString(mas);

        int i = 0;

        System.out.print("[");

        while (i < mas.length) {
            System.out.print(mas[i]);

            if (i != mas.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.print("]");

    }

    private static void toString(int[] mas) {
        System.out.print("[");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);

            if (i != mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}