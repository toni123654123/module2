package week1.Vong_lap_trong_Java;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhâp số lượng số muốn kiểm tra: ");
        int numbers = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}