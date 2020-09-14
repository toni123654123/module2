package week1.Mang_va_phuong_thuc_trong_Java;
import java.util.Scanner;

public class AddAraay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array = {1, 5, 6, 7, 9, 3, 4, 10, 2, 3};
        System.out.println("Befor: ");
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.print("Enter the number:");
        int number = scanner.nextInt();
        System.out.print("Enter the index:");
        int index = scanner.nextInt();
        AddNumber(number, index, array);

    }

    static void AddNumber(int number, int index, int[] array) {
        for (int j = array.length - 1; j >= index; j--) {
            if (j == index) {
                array[j] = number;
                break;
            }
            array[j] = array[j - 1];
        }
        System.out.println("After");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
