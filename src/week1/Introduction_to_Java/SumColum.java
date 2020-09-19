package week1.Introduction_to_Java;

import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row in: ");
        int row = scanner.nextInt();
        System.out.print("Colum in: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("arr [" + i + "][" + j + "] =  ");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter Column");
        int colum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colum];
        }
        System.out.println(sum);
    }
}

