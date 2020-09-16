package week2.He_cac_doi_tuong_hinh_hoc.circlee;

public class TestCirclee {
    public static void main(String[] args) {
        Circlee circlee = new Circlee();
        System.out.println(circlee);

        circlee = new Circlee(3.5);
        System.out.println(circlee);

        circlee = new Circlee(3.5, "green",false );
        System.out.println(circlee);
    }
}
