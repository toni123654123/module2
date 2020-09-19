package week1.Introduction_to_Java;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter char ");
            str = scanner.nextLine();
            if (str.length() >= 2) {
                System.out.println("Sorry, max string = 1");
            }
        } while (str.length() >= 2);
        
        String string = "Dont worryyy";
        int count = 0;

        for (int k = 0; k < string.length(); k++) {
            if (str.charAt(0) == string.charAt(k)) {
                count += 1;
            }
        }
        System.out.println(count);
    }

}
