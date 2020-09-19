package week1.Introduction_to_Java;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        System.out.println("Kiem tra");
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter size");
            size = scanner.nextInt();
            if(size >30){
                System.out.println("Size is not 30");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List or mark: ");
        for (int k : arr) {
            System.out.print(k + "\t");
            if (k >= 5 && k <= 10) {
                count++;
            }
            System.out.println(" Pass " + count);
        }
    }

}
