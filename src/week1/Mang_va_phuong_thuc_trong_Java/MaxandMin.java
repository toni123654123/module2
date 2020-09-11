package week1.Mang_va_phuong_thuc_trong_Java;

public class MaxandMin {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 1, 3, 5, 7, 9, 22};
        int max= arr[0];
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) {
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: "  +  max);
        System.out.println("Giá trị nhỏ nhất của mảng là: "+min);
    }
}
