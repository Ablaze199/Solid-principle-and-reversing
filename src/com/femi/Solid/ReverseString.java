package com.femi.Solid;

public class ReverseString {
    public static void main (String[] args) {
        //1) using + (string concatenation) operator

        String str = "ABCD";
        String rev = "";
//        int len = str.length();
//        for (int i =len-1; i>=0; i--);
//        {
//
//            rev=rev+str.charAt();
//        }
//        System.out.println("Reverse string is; " + rev);

//        char a[] = str.toCharArray();
//        int len = a.length;
//        for (int i =len-1; i>=0; i--);
//        {
//            rev=rev+a[i];
//        }
//        System.out.println("Reverse string is; " + rev);

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
