package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CompleteARRA {

    // Type in a Roman number between I and MMMMMCMXCIX inclusive. Get the arabic number version of it. OR
    // Type in a number between 0 and 5999 inclusive. Get the roman version of it.

    public static void main(String[] args) throws IOException {

        //Testing the RTA method in the RomanToArabic class.
        /*RTATest t = new RTATest();
        t.tester();*/

        //For test, comment out from this point.
        ArabicToRoman ar = new ArabicToRoman();
        RomanToArabic ra = new RomanToArabic();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (true) {
            input = reader.readLine();

            boolean falseRomanChars = Pattern.matches("[^[\\w&&[^MDCLXVI]]]+", input);
            if (falseRomanChars) {
                //boolean falseRomanSyntax = Pattern.matches("[M]{0,5}[CM]?[CD]?[D]?[c]{0,3}[XC]?", input);
                //if(falseRomanSyntax){
                    System.out.println(ra.RTA(input));
                //}else{
                   // System.out.println("False syntax.");
                //}

            }
            boolean falseArabic = Pattern.matches("[\\d]+", input);
            if (falseArabic) {
                System.out.println(ar.ATR(input));
            }
        }
        //For test, comment till this point.
    }
}

