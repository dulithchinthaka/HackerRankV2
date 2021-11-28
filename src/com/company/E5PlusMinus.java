package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E5PlusMinus {

    public static void main(String[] args) {
        double d = 3.76;
       // System.out.printf("%.6f",d);


        plusMinus(new ArrayList<>(Arrays.asList(-4,2,3,2,5,6,0,0,2,-8)));
    }

    public static void plusMinus(List<Integer> arr) {




        int positiveNum=0;
        int zeros=0;
        int negativeNum=0;
        int totalNumbers=arr.size();

        for (int i = 0; i < totalNumbers; i++) {
            if (arr.get(i)>0){
                positiveNum++;
            }else if(arr.get(i)<0){
                negativeNum++;
            }else{
                zeros++;
            }
        }


        System.out.printf("%.6f",(double) positiveNum/totalNumbers);
        System.out.println();
        System.out.printf("%.6f",(double) negativeNum/totalNumbers);
        System.out.println();
        System.out.printf("%.6f",(double) zeros/totalNumbers);





    }
}
