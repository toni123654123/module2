package week1;
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The Month " + month +" 31days");
                break;
            case 2:
                System.out.println("The Month " + month +" 28days or 29days ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The Month "+ month +" 30days ");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
