package com.company;

import java.util.List;

public class E3VeryBigSum {
    public static void main(String[] args) {

    }

    public static long aVeryBigSum(List<Long> ar) {
        Long sum= 0L;
        for (int i = 0; i < ar.size(); i++) {
            sum+=ar.get(i);
        }
        return sum;

    }

}
