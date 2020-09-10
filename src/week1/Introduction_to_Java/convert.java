package week1.Introduction_to_Java;
import java.util.Scanner;
import java.lang.String;
public class convert {
    public static void main(String[] args) {
        int num;
        String result= "";
        System.out.print("Nhập số: ");
        Scanner number = new Scanner(System.in);
        num = number.nextInt();
        result= tripleNum(num);
        System.out.println(result);

    }
    public static String singleNum(int number){
        switch(number){
            case 0: return "";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }

    }
    public static String tripleNum(int number){
        String a= "";
        if(number/100!=0) a= " hundred and ";
        return singleNum(number/100)+ a + doubleNum(number%100);
    }
    public static String doubleNum(int number){
        switch(number/10){
            case 0: return singleNum(number%10);
            case 1: return edgyTeen(number%10);
            case 2: return "twenty " + singleNum(number%10);
            case 3: return "thirty " + singleNum(number%10);
            case 4: return "fourty " + singleNum(number%10);
            case 5: return "fifty " + singleNum(number%10);
            case 6: return "sixty " + singleNum(number%10);
            case 7: return "seventy " + singleNum(number%10);
            case 8: return "eighty " + singleNum(number%10);
            case 9: return "ninety " + singleNum(number%10);
            default: return "";
        }
    }
    public static String edgyTeen(int number){
        switch (number){
            case 0: return "ten";
            case 1: return "eleven";
            case 2: return "twelve";
            case 3: return "thirteen";
            case 4: return "fourteen";
            case 5: return "fifteen";
            case 6: return "sixteen";
            case 7: return "seventeen";
            case 8: return "eighteen";
            case 9: return "nineteen";
            default: return "";
        }
    }
}