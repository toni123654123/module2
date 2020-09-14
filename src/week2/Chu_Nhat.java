package week2;

import java.util.Scanner;

public class Chu_Nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Lop_Chu_Nhat rectangle = new Lop_Chu_Nhat(width, height);
        System.out.println("Your Rectangle " + rectangle.display());
        System.out.println("Permimeter " + rectangle.getPerimeter());
        System.out.println("Area " + rectangle.getArea());
    }
}
