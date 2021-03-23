package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToArabic {

        public int romanToArabic(String rom) {

            Map<String, Integer> numbers = new LinkedHashMap<String, Integer>();
            numbers.put("CM", 900);
            numbers.put("M", 1000);
            numbers.put("CD", 400);
            numbers.put("D", 500);
            numbers.put("XC", 90);
            numbers.put("C", 100);
            numbers.put("XL", 40);
            numbers.put("L", 50);
            numbers.put("IX", 9);
            numbers.put("X", 10);
            numbers.put("IV", 9);
            numbers.put("V", 5);
            numbers.put("I", 1);

            int arab = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(rom);

            for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
                while (sb.toString().contains(entry.getKey())) {
                    arab = arab + entry.getValue();
                    if (entry.getKey().length() == 1) {
                        int shiftIndex = sb.indexOf(entry.getKey());
                        sb.replace(shiftIndex, shiftIndex + 1, " ");
                    } else if (entry.getKey().length() == 2) {
                        int shiftIndex = sb.indexOf(entry.getKey());
                        sb.replace(shiftIndex, shiftIndex + 2, " ");
                    }
                }
            }
            return arab;
        }
}
