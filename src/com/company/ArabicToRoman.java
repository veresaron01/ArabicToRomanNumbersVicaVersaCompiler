package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArabicToRoman {

    public String atr(String arab){
        ArabicToRoman ar = new ArabicToRoman();
        int ara = Integer.parseInt(arab);
        String result = ar.arabicToRoman(ara);
        return result;
    }

    StringBuilder sb = new StringBuilder();
    public String arabicToRoman(int arab){
        if(arab > 5999){return "The maximum value is 5999.";}

        if(arab>=1000){
            arab = arab - 1000;
            sb.append("M");
            arabicToRoman(arab);
        }
        else if(arab>=900){
            arab = arab - 900;
            sb.append("CM");
            arabicToRoman(arab);
        }
        else if(arab>=500 && arab<900){
            arab = arab - 500;
            sb.append("D");
            arabicToRoman(arab);
        }
        else if(arab>=400 && arab<500){
            arab = arab - 400;
            sb.append("CD");
            arabicToRoman(arab);
        }
        else if(arab>=100){
            arab = arab - 100;
            sb.append("C");
            arabicToRoman(arab);
        }
        else if(arab>=90){
            arab = arab - 90;
            sb.append("XC");
            arabicToRoman(arab);
        }
        else if(arab>=50 && arab<90){
            arab = arab - 50;
            sb.append("L");
            arabicToRoman(arab);
        }
        else if(arab>=40 && arab<50){
            arab = arab - 40;
            sb.append("XL");
            arabicToRoman(arab);
        }
        else if(arab>=10){
            arab = arab - 10;
            sb.append("X");
            arabicToRoman(arab);
        }
        else if(arab==9){
            arab = arab - 9;
            sb.append("IX");
            arabicToRoman(arab);
        }
        else if(arab>=5 && arab<9){
            arab = arab - 5;
            sb.append("V");
            arabicToRoman(arab);
        }
        else if(arab==4){
            arab = arab - 4;
            sb.append("IV");
            arabicToRoman(arab);
        }
        else if(arab>=1){
            arab = arab - 1;
            sb.append("I");
            arabicToRoman(arab);
        }
        return sb.toString();
    }

    public String arabicToRoman2(String arabStr){
        int arab = Integer.parseInt(arabStr);
        StringBuilder sb = new StringBuilder();

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



        return sb.toString();
    }

}


