package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E2CompareTriplet

{
    public static  void main(String args[]){




;
        int[] a = {1,2,6};
        int[] b ={1,6,8};

        int[] comparison = getComparison(a, b);

        System.out.println("["+comparison[0]+","+comparison[1]+"]");


    }

   static int[] getComparison(int[] a,int[] b){
        int[] result=new int[2];
        for (int i = 0; i < 3; i++) {
            if (a[i]>b[i]){
                result[0]++;
            } else if(a[i]<b[i]){
                result[1]++;
            }
        }


        return result;
    }

   static List<Integer>  compareTriplets(List<Integer> a, List<Integer> b) {

        int a_result=0;
        int b_result=0;

       for (int i = 0; i < a.size(); i++) {
           if (a.get(i)>b.get(i)){
               a_result++;
           }
           if (a.get(i)<b.get(i)){
               b_result++;
           }

       }
       return new ArrayList<>(Arrays.asList(a_result,b_result));

   }

}
