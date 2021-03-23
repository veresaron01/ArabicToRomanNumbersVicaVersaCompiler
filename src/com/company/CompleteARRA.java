package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

public class CompleteARRA {

    // Type in a Roman number between I and MMMMMCMXCIX inclusive. Get the arabic number version of it. OR
    // Type in a number between 0 and 5999 inclusive. Get the roman version of it. OR
    // Type in "exit" to end the process.

    public static void main(String[] args) throws IOException {

        HashSet<String> regexes = new HashSet<String>();
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(IX)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(IV)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XL)?(X){0,3}(IX)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(IX)?(I){0,3}");

        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XL)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CM)?(D)?(C){0,3}(XC)?(X){0,3}(V)?(I){0,3}");

        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XC)?(X){0,3}(IX)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XC)?(X){0,3}(IV)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XL)?(X){0,3}(IX)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XL)?(X){0,3}(IV)?(I){0,3}");

        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XC)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XC)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XL)?(X){0,3}(V)?(I){0,3}");
        regexes.add("(M){0,5}(CD)?(D)?(C){0,3}(XL)?(X){0,3}(V)?(I){0,3}");

        ArabicToRoman ar = new ArabicToRoman();
        RomanToArabic ra = new RomanToArabic();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            if (input.matches("[^[\\w&&[^MDCLXVI]]]+")){
                boolean b = false;
                label: for (String regex : regexes){
                    if (input.matches(regex)) {
                        System.out.println(ra.romanToArabic(input));
                        b = true;
                        break label;
                    }
                }
                if (!b) {
                    System.out.println("False roman syntax.");
                }
            } else if (input.matches("[\\d]+")) {
                System.out.println(ar.atr(input));
            }
        }
    }
}
