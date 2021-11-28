package com.company;

import java.util.List;

public class E4DiaginalDifference {
    public static void main(String[] args) {

    }


    public static int diagonalDifference(List<List<Integer>> arr) {


        int size= arr.size();

        int rightSum=0;
        for (int i = 0; i < size; i++) {
            rightSum+=arr.get(i).get(i);
        }

        int leftSum=0;
        for (int i = 0; i < size; i++) {
            leftSum+=arr.get(i).get(size-1-i);
        }
        return  Math.abs(rightSum-leftSum);

    }


}
