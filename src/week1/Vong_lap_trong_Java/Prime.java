package week1.Vong_lap_trong_Java;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int i;
        boolean check = true;
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("vui lòng nhập số: ");
        num = number.nextInt();
        if(num<2) check= false;
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                check = false;
                break;
            }
        }
        if (check)
            System.out.println(num + " is a prime ");
        else
            System.out.println(num + " is not a prime ");
    }
}
