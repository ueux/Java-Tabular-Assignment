// File: q24.java

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        System.out.println("Triangle of numbers:");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
