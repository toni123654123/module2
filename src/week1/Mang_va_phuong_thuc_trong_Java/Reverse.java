package week1.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int counter,
                i ,
                j ,
                temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập vào số phần tử trong mảng: ");
        counter = scanner.nextInt();
        for (i = 0; i < counter; i++) {
            System.out.println("Phần tử " + (i + 1) + ": ");
            number[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi đảo ngược: ");
        for(i = 0; i<counter;i++)
        System.out.print(number[i] + " ");
        System.out.println();

        j = i - 1;
        i = 0;
        scanner.close();
        while (i < j) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        for (i = 0; i < counter; i++) {
            System.out.print(number[i] + " ");
        }
    }
}