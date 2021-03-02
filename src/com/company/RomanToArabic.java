package com.company;

public class RomanToArabic {

    // Commented out lines disturb the normal results of the method. Otherwise serve as a roman number syntax logic.

    public static int RTA(String roman) {

        RomanToArabic ra = new RomanToArabic();
        int result = ra.romanToArabicInner(roman);

        return result;
    }

        public int romanToArabicInner (String rom){
            int arab = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(rom);

            int mCount = 0;
            int cCount = 0;
            int xCount = 0;
            int iCount = 0;

            if (sb.toString().contains("CM")) {
                int shiftIndex = sb.indexOf("CM");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 900;
                //countos megoldas kell a vegere, vagy kozben
                //if((sb.toString().contains("C")) || (sb.toString().contains("D"))){return -20;}
            } if ((sb.toString().contains("CM")) ) {return -19;}

            while (sb.toString().contains("M")) {
                int shiftIndex = sb.indexOf("M");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 1000;
                mCount++;
                if(mCount > 5){return -18;}
            }
            if (sb.toString().contains("CD")) {
                int shiftIndex = sb.indexOf("CD");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 400;
                //if((sb.toString().contains("C")) || (sb.toString().contains("D")) || (sb.toString().contains("CM"))){return -17;}
            }if ((sb.toString().contains("CD")) ) {return -16;}

            if(sb.toString().contains("D")) {
                int shiftIndex = sb.indexOf("D");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 500;
                if((sb.toString().contains("CD")) || (sb.toString().contains("CM")) ){return -15;}
            }if (sb.toString().contains("D")) {return -14;}

            if (sb.toString().contains("XC")) {
                int shiftIndex = sb.indexOf("XC");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 90;
                if((sb.toString().contains("CD")) || (sb.toString().contains("CM")) || (sb.toString().contains("M")) || (sb.toString().contains("D")) ){return -13;}
            } if ((sb.toString().contains("XC")) ) {return -12;}

            while (sb.toString().contains("C")) {
                int shiftIndex = sb.indexOf("C");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 100;
                cCount++;
                if(cCount > 3){return -11;}
            }
            if (sb.toString().contains("XL")) {
                int shiftIndex = sb.indexOf("XL");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 40;
                if( (sb.toString().contains("L"))){return -10;}
            } if ((sb.toString().contains("XL")) ) {return -9;}

            if(sb.toString().contains("L")) {
                int shiftIndex = sb.indexOf("L");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 50;
            }if (sb.toString().contains("L")) {return -8;}

             if(sb.toString().contains("IX")) {
                int shiftIndex = sb.indexOf("IX");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 9;
                 //if( (sb.toString().contains("X"))){return -7;}
            } if ((sb.toString().contains("IX")) ) {return -6;}

            while(sb.toString().contains("X")) {
                int shiftIndex = sb.indexOf("X");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 10;
                xCount++;
                if(xCount > 3){return -5;}
            }
            if(sb.toString().contains("IV")) {
                int shiftIndex = sb.indexOf("IV");
                sb.replace(shiftIndex, shiftIndex + 2, " ");
                arab = arab + 4;
                if((sb.toString().contains("V"))){return -4;}
            } if ((sb.toString().contains("IV")) ) {return -3;}

            if(sb.toString().contains("V")) {
                int shiftIndex = sb.indexOf("V");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 5;
            }if (sb.toString().contains("V")) {return -2;}

            while(sb.toString().contains("I")) {
                int shiftIndex = sb.indexOf("I");
                sb.replace(shiftIndex, shiftIndex + 1, " ");
                arab = arab + 1;
                iCount++;
                if(iCount > 3){return -1;}
            }

            return arab;
        }



}
