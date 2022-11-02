import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 12;
        float f = 3.5f;

        System.out.println(x);
        System.out.println(f);
        System.out.println("x = " + x + ", f = " + f );

        // 1-D Array
        int arr1[] = {11, 22, 33, 44, 55};
        int[] arr3;

        arr3 = new int[10];

        Random r = new Random();

        System.out.print("Elements of arr1: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = r.nextInt(500);
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        // 2-D Array
        int[][] table;

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows? ");
        table = new int [sc.nextInt()] [];

        System.out.println("Elements of table: ");

        for (int i = 0; i < table.length; i++) {
            table[i] = new int  [r.nextInt(10) + 1];

            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = r.nextInt(100);
                System.out.print(table[i][j] + " ");
            }

            System.out.println();
        }
    }
}