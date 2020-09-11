package week1.Mang_va_phuong_thuc_trong_Java;
import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Bạn muốn chuyển đổi độ C sang dộ F ấn 1 ");
        System.out.println("Bạn muốn chuyển đổi độ F sang độ C ấn 2 ");
        int convert= sc.nextInt();
        switch (convert){
            case 1:{
                System.out.println("Vui long nhap do C: ");
                double C = sc.nextDouble();
                double F = (C+32)*(9.0/5.0);
                System.out.println("Ket qua chuyen doi: "+ F);
                break;
            }
            case 2:{
                System.out.println("Vui long nhap do F: ");
                double F = sc.nextDouble();
                double C = (5.0/9.0)*F-32;
                System.out.println("ket qua chuyen doi: "+C);
                break;
            }
            default: return;
        }
    }
}
