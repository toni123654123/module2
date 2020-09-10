package week1.Introduction_to_Java;
import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        USD = scanner.nextDouble();
        double convert = USD * VND;
        System.out.println("So tien: "+  convert);

    }
}
