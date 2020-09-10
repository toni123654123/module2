package week1;
import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        if (a != 0){
            double solution = (c-b)/a;
            System.out.println("Result "+solution);
        }else{
            if (b == 0){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("Not solution!");
            }
        }
    }
}
