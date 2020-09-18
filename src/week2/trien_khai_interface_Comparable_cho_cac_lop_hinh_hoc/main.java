package week2.trien_khai_interface_Comparable_cho_cac_lop_hinh_hoc;
import java.util.Comparator;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]= new Circle();
        circles[1]=new Circle(10.0);
        circles[2]=new Circle(5.0,"Red",true);

        System.out.println("Pre-sorted:");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        Comparator circleComparator= new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
