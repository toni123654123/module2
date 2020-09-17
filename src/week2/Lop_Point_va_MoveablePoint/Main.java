package week2.Lop_Point_va_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(3,4,3,4);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
