package week2.StopWatch;

public class StopWatch {
    public final int Slow = 1;
    public final int Medium = 2;
    public final int Fast = 3;
    private int speed = Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public StopWatch(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getStatus() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed() {
        return this.speed = speed;
    }

    public boolean setStatus() {
        return this.on = on;
    }

    public double setRadius() {
        return this.radius = radius;
    }

    public String setColor() {
        return this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", Fan is on!" +
                    '}';
        } else {
            return "Fan off";
        }
    }
}
