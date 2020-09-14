package week2.QuadraticEquation;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter num a: ");
        double a = scanner.nextDouble();
        System.out.print(" Enter num b: ");
        double b = scanner.nextDouble();
        System.out.print(" Enter num c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double d = quadraticEquation.getDiscriminant(a, b, c);
        quadraticEquation.getRoot(d);
    }
}
