package week2.Lop_Circle_va_lop_Cylinder;

public class Circleee {
    private double raidus;
    private String color;

    public Circleee() {

    }

    public Circleee(double raidus, String color) {
        this.raidus = raidus;
        this.color = color;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.raidus*this.raidus*Math.PI;
    }

    @Override
    public String toString() {
        return "Circleee{" +
                "raidus=" + raidus +
                ", color='" + color + '\'' +
                '}';
    }
}
