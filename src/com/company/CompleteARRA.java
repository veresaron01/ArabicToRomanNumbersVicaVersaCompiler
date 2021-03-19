package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CompleteARRA {

    // Type in a Roman number between I and MMMMMCMXCIX inclusive. Get the arabic number version of it. OR
    // Type in a number between 0 and 5999 inclusive. Get the roman version of it.

    public static void main(String[] args) throws IOException {

        ArabicToRoman ar = new ArabicToRoman();
        RomanToArabic ra = new RomanToArabic();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (true) {
            input = reader.readLine();

            if (input.matches("[^[\\w&&[^MDCLXVI]]]+")) {
                //boolean falseRomanSyntax = Pattern.matches("[M]{0,5}[CM]?[CD]?[D]?[c]{0,3}[XC]?", input);
                //if(falseRomanSyntax){
                System.out.println(ra.rta(input));
                //}else{
                // System.out.println("False syntax.");
                //}
            } else if (input.matches("[\\d]+")) {
                System.out.println(ar.atr(input));
            }
        }
    }
}

