package week2;
public class Lop_Chu_Nhat {

    double width, hegiht;

    public Lop_Chu_Nhat(double width, double hegiht){
        this.width = width;
        this.hegiht = hegiht;
    }
    public double getArea(){
        return this.width*this.hegiht;
    }
    public  double getPerimeter(){
        return (this.width*this.hegiht)*2;
    }
    public  String display(){
        return " width = "+width + " height = " + hegiht ;
    }


}

