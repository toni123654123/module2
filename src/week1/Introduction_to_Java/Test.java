package week1.Introduction_to_Java;

import java.util.Scanner;

public class Test {
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
        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%-4d", arr[i][j]);
                if (j == arr[i].length - i - 1) {
                    sum2 += arr[i][j];
                }

            }

            System.out.println();
        }

//        int sum = 0;
//        int ar= arr.length - 1;
//        for (int i = 0; i < arr.length; i++) {
//                sum += arr[i][ar];
//                ar -=1;
//
//        }
        System.out.print(" SumLine: ");
        System.out.println(sum2);
    }
}
