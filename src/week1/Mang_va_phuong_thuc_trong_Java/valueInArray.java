package week1.Mang_va_phuong_thuc_trong_Java;

import java.util.Scanner;

public class valueInArray {
    public static void main(String[] args) {

        System.out.println("Tìm kiếm trong chuỗi: ");
        String[] studens = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C"};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(name)) {
                System.out.print("Từ bạn cần tìm nằm ở vị trí " + (i + 1));
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.println("Từ cần tìm không có trong này");
        }

    }
}
