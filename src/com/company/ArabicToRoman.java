package com.company;

public class ArabicToRoman {

    // Type in a number between 0 and 5999 inclusive. Get the roman version of it. Repeat till 0 is typed.

    public String ATR(String arab){
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

    }


