package week2.StopWatch;

public class Fan {
    public static void main(String[] args) {
        StopWatch fan1 = new StopWatch(3,true,10,"while");
        StopWatch fan2 = new StopWatch(2,false,5,"blue");
        System.out.println("First Fan: " + fan1);
        System.out.println("Second Fan: " + fan2);
    }
}
