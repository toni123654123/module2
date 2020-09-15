package week2.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1= new Student(111,"Tuan");
        Student student2= new Student(222,"Hoang");
        Student student3= new Student(333,"Nam");
        student1.display();
        student2.display();
        student3.display();
    }
}
