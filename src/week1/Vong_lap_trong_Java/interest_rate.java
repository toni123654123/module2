package week1.Vong_lap_trong_Java;
import java.util.Scanner;
public class interest_rate {
    public static void main(String[] args) {
        double  Deposits  ;
        int Month;
        double Interest;
        Scanner money = new Scanner(System.in);
        System.out.println(" nhập số tiền: ");
        Deposits = money.nextDouble();
        Scanner month = new Scanner(System.in);
        System.out.println(" nhập số tháng: ");
        Month = month.nextInt();
        Scanner interest = new Scanner(System.in);
        System.out.println(" nhập lãi suất:");
        Interest = interest.nextDouble();
        double Profit_amount = 0;
        for (int i = 0; i < Month ; i++ ){
            Profit_amount = Deposits * (Interest / 100) / 12 * Month;
        }
        System.out.println("Profit amount " + Profit_amount);
    }

}
//public class interest_rate {
//
//    public static void main(String[] args) {
//
//        double money = 1.0;
//        int month = 1;
//        double interset_rate = 1.0;
//
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        System.out.println("Money: ");
//        money = input.nextDouble();
//        System.out.println("Time (month): ");
//        month = input.nextInt();
//        System.out.println("Interest rate: ");
//        interset_rate = input.nextDouble();
//
//        double total_interset = 0;
//        for (int i = 0; i < month; i++) {
//            total_interset = money * (interset_rate / 100) / 12 * month;
//        }
//
//        System.out.println("Total interset: " + total_interset);
//    }
//}
