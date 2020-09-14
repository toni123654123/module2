package week2.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(double a, double b, double c) {
        double delta = this.b * this.b - 4 * this.a * this.c;
        System.out.println("Delta: " + delta);
        return delta;
    }

    public void getRoot(double delta) {
        double x1;
        double x2;
        if (delta > 0) {
            x1 =  ((-this.b - Math.sqrt(delta)) / (2 * this.a));
            x2 = ((-this.b - Math.sqrt(delta)) / (2* this.a));
            System.out.println("x1 = "+ x1 + " x2 = " + x2 );
        }else if (delta==0){
            x1 = (-this.b)/(2*this.a);
            System.out.println(" x1 = x2 = "+ x1);
        }else {
            System.out.println(" Phuong trinh vo nghiem");
            return;
        }
    }
}
