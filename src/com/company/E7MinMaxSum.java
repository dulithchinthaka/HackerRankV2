package com.company;

import java.util.Arrays;
import java.util.List;

public class E7MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(7,6,5,4,3,2,1,0));
    }


    public static void miniMaxSum(List<Integer> arr) {
        int size= arr.size();
        for (int j =0; j <size-1 ; j++) {
        for (int i =0; i<size-1-j; i++) {

                if (arr.get(i)>arr.get(i+1)){
                    int temp=arr.get(i+1);
                    arr.set(i+1,arr.get(i));
                    arr.set(i,temp);
                }
            }
        }
        Long min=0L;
        for (int i = 0; i < 4; i++) {
            min+=arr.get(i);
        }
        Long max=min-arr.get(0)+arr.get(4);

        System.out.println(min+" "+max);


    }

}
