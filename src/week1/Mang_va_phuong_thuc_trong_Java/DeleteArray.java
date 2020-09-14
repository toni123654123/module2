package week1.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 1, 3, 5, 2, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban dau:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.print(" nhap so can xoa: ");
        int x = scanner.nextInt();
        for (int j = 0; j <= arr.length - 1; j++) {
            int pos = j;
            if (x == arr[j]) {
                System.out.println("Vi tri : " + pos);
                for (int k = pos; k <= arr.length - 1; k++) {
                    if (pos == arr.length - 1) {
                        arr[pos] = 0;
                    } else {
                        arr[pos] = arr[pos + 1];
                        arr[pos + 1] = 0;
                        pos++;
                    }
                }
            }

        }
        System.out.println("Sau khi xoa");
        for (int j : arr) {
            System.out.print(j + ",");
        }

    }

}
