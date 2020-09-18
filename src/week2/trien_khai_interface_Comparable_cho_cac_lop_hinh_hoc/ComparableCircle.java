package week2.trien_khai_interface_Comparable_cho_cac_lop_hinh_hoc;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){

    }
    public ComparableCircle(double radius){
        super(radius);

    }
    public ComparableCircle(double radius,String color, boolean filled){
        super(radius, color, filled);
    }
    public int compareTo(ComparableCircle o){
        if (getRadius()>o.getRadius())return 1;
        else if (getRadius()<o.getRadius())return -1;
        else return 1;
    }

}