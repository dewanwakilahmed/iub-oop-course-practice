package mainpkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        val = sc.nextInt();
        System.out.println("Value = " + val);
    }
}