package week2.trien_khai_interface_Comparable_cho_cac_lop_hinh_hoc;
import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getArea()>o2.getArea())return 1;
        else if (o1.getArea()<o2.getArea())return -1;
        else return 0;
    }
}
