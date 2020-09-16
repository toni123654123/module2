package week2.He_cac_doi_tuong_hinh_hoc.rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle);
        rectangle = new Rectangle("red", true, 30, 40);
        System.out.println(rectangle);
    }
}
