package week2.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hocAssignment;

public class Main {
    public static void main(String[] args) {
        Shape[] shape= new Shape[3];
        shape[0]= new Circle(5);
        shape[1]=new Rectangle(3,3);
        shape[2]= new Square(10);
        for (Shape shape1:shape){
            System.out.println(shape1);
        }
        System.out.println("after");
        double percent= Math.round(Math.random()*100+1);

        for (Shape shape1: shape){
            shape1.resize(percent);
            System.out.println(shape1);
        }
    }
}
