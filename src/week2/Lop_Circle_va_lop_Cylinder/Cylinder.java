package week2.Lop_Circle_va_lop_Cylinder;

public class Cylinder extends Circleee {
    private double height;

    public Cylinder(double raidus, String color, double height) {
        super(raidus, color);
        this.height = height;
    }
    public double getVolum(){
        return this.height*this.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "GetVolum=" + getVolum() +
                '}'
                + super.toString();
    }
}
