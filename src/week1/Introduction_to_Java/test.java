package week1.Introduction_to_Java;

import java.util.Scanner;
import java.lang.String;

public class test {
    //    if (( int num = num.toString()).length > 9) return 'overflow';
//    int n = ('000000000' + num).substr(-9).match(/^(\d{2})(\d{2})(\d{2})(\d{1})(\d{2})$/);
//    if (!n) return;
//    int str = '';
//    str += (n[1] != 0) ? (a[Number(n[1])] || b[n[1][0]] + ' ' + a[n[1][1]]) + 'crore ' : '';
//    str += (n[2] != 0) ? (a[Number(n[2])] || b[n[2][0]] + ' ' + a[n[2][1]]) + 'lakh ' : '';
//    str += (n[3] != 0) ? (a[Number(n[3])] || b[n[3][0]] + ' ' + a[n[3][1]]) + 'thousand ' : '';
//    str += (n[4] != 0) ? (a[Number(n[4])] || b[n[4][0]] + ' ' + a[n[4][1]]) + 'hundred ' : '';
//    str += (n[5] != 0) ? ((str != '') ? 'and ' : '') + (a[Number(n[5])] || b[n[5][0]] + ' ' + a[n[5][1]]) + 'only ' : '';
//    return str;
    public static void main(String[] args) {
        int num;
        String result = "";
        System.out.println(" nhập số: ");
        Scanner number = new Scanner(System.in);
        num = number.nextInt();
        result = tripleNum(num);
        System.out.println(result);
    }

    public static String singleNum(int number) {
        switch (number) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String tripleNum(int number) {
        String num = "";
        if (number / 100 != 0) num = " hundred and ";
        return singleNum(number / 100) + num + doubleNum(number % 100);
    }

    public static String doubleNum(int number) {
        switch (number/10) {
            case 0:
                return singleNum(number % 10);
            case 1:
                return eggNum(number % 10);
            case 2:
                return " twenty " + singleNum(number % 10);
            case 3:
                return " thirty " + singleNum(number % 10);
            case 4:
                return " fourty " + singleNum(number % 10);
            case 5:
                return " fifty " + singleNum(number % 10);
            case 6:
                return " sixty " + singleNum(number % 10);
            case 7:
                return " seventy " + singleNum(number % 10);
            case 8:
                return " eighty" + singleNum(number % 10);
            case 9:
                return " ninety " + singleNum(number % 10);
            default:
                return "";

        }
    }

    public static String eggNum(int number) {
        switch (number) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "thirteen";
            case 5:
                return "fourteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
            default:
                return "";
        }
    }
}
