package com.company;

public class E9TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45AM"));

    }
    public static String timeConversion(String s) {
        // Write your code here
        char ap = s.charAt(8);
        String hours = s.substring(0, 2);
        int hoursNumber=Integer.parseInt(hours);
        System.out.println(hours);
        String  conversion;
        int lastIndex=s.length()-2;
        if (ap=='A'){


            if(hoursNumber==12){
                hoursNumber=0;
                conversion=hoursNumber+s.substring(2,lastIndex);
            }else {
                conversion = s.substring(0,lastIndex);
            }
        }else{
            if(hoursNumber<12){
                hoursNumber+=12;
                conversion=hoursNumber+s.substring(2,lastIndex);
            }else {
                conversion = s.substring(0,lastIndex);
            }
        }
        return conversion;
    }
}
