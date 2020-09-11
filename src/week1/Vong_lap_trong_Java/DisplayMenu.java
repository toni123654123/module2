package week1.Vong_lap_trong_Java;
import java.util.Scanner;
public class DisplayMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Rectangle: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Bottom-left: ");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }

                    System.out.println("Top-left: ");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }

                    System.out.println("Bottom-right: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println("\n");
                    }

                    System.out.println("Top-right: ");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < 5; j++) {
                            if (j < 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    System.out.println("Isosceles triangle: ");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println("\n");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("No choice!");
            }
        }
    }
}
