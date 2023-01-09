import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[]{3, 5, 4, 6, 3, 2, 4, 6, 7, 5, 3, 2, 4, 5};

        System.out.println(Arrays.toString(mas));
//        System.out.println(mas);


        System.out.print("[");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]);
            System.out.print(", ");
        }

        System.out.print("]");

    }
}