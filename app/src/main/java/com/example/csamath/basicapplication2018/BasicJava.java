package com.example.csamath.basicapplication2018;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by csamath on 6/9/2018.
 */

public class BasicJava {
    public static void main(String args[]){
        System.out.println("Hello PIS!");
        int i = 8 ;
        int j = 250 ;
        int Total = i + j;

        System.out.println("The resutl is : "+Total);

        String str = "I Love Java Programing!";

        // show all sting
        String strShowAll = str;
        System.out.println("the rsutlt all string : " + strShowAll);

        // leng of string
        int strLengString = str.length();
        System.out.println("Leng of string : " + strLengString);

        // cut by spsce
        String[] strStl = str.split(" ");
        for (int c=0 ; c < strStl.length ; c++)
        {
            System.out.println("----- The resutl of plit is : "+ strStl[c]);

        }

        // take out word "Java"
        String strSubString = str.substring(7,12);
        System.out.println("Sub string is : "+strSubString);


        // Revers string
        StringBuilder strBulder = new StringBuilder();
        strBulder.append(str);
        strBulder = strBulder.reverse();
        System.out.println("The result of String Revers : "+ strBulder);

        /// using gradle import -------------------------------
        System.out.println("Using Gradle library Reverse: "+ StringUtils.reverse(str));

        // print all array element -----

        double[] myNum = {23.34,8478.09,874.00,8474.87,8576.9};

        for (int x = 0 ; x < myNum.length ; x++)
        {
            System.out.println("the Resutl Arry : " + myNum[x]  );
        }


    }
}
