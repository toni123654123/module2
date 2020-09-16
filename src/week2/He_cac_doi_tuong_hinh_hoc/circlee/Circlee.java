package week2.He_cac_doi_tuong_hinh_hoc.circlee;

import week2.He_cac_doi_tuong_hinh_hoc.Shape.Shape;

public class Circlee extends Shape {
    private double radius = 1.0;

    public Circlee() {
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public Circlee(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}


