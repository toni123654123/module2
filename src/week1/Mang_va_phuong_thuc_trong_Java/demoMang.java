package week1.Mang_va_phuong_thuc_trong_Java;

public class demoMang {

    public static void main(String[] args) {
        int arr[];
        arr = new int[4];
        arr[0] = 9;
        arr[1] = 17;
        arr[2] = 13;
        arr[3] = 14;

        String arrString[] = {"A", "B", "C"};

        System.out.println("Mảng số nguyên: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMảng các chuỗi: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(arrString[i] + " ");
        }
        System.out.println("");
    }
}
