package week2.He_cac_doi_tuong_hinh_hoc.rectangle;

import week2.He_cac_doi_tuong_hinh_hoc.shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(double side, String color, boolean filled){
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public  double getArea(){
         return width * this.length;
    }
    public double getPerimeter(){
        return 2*(width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                '}'
                + super.toString();
    }
}
