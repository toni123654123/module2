package week2.Accessmodifier;

import week2.Accessmodifier.Circle.circle;

public class TestCircle {
    public static void main(String[] args) {
        circle.Circle circle1 = new circle.Circle();
        System.out.println("Area: " + circle1.getArea() + "  Radius:" + circle1.getRadius());
        circle.Circle circle2 = new circle.Circle(5);
        System.out.println("Area: " + circle2.getArea() + "  Radius:" + circle2.getRadius());
    }

}

