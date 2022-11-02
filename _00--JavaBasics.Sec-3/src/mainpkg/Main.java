package mainpkg;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("The random number is: " + r.nextInt(500));

        int id;
        String name;
        float salary;

        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        salary = sc.nextFloat();

        System.out.println("ID = " + id + ", Name: " + name + ", Salary = " + salary);
    }
}