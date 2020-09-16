package week2.Accessmodifier;


import week2.Accessmodifier.circle.Circle;

 class TestCircle {
    public static void main(String[] args) {
       Circle circle1 = new Circle();
        System.out.println("Area: " + circle1.getArea() + "  Radius:" + circle1.getRadius());
        Circle circle2 = new Circle(5.0);
        System.out.println("Area: " + circle2.getArea() + "  Radius:" + circle2.getRadius());
    }
}

