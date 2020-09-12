package week1.Mang_va_phuong_thuc_trong_Java;

public class Min {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);

        System.out.println("The smallest  element in the array is: " + index);
    }
    public static int minValue(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (min > arr[i]) {

                min = arr[i];
            }

        }
        return min;
    }

}
