package com.company;

import java.util.Arrays;
import java.util.List;

public class E8CakeCandle {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(1,2,5,4,2,5,2,5,5)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
      /*  // Write your code here
        int size=candles.size();
        for (int i = 0; i <size-1; i++) {
            for (int j = 0; j<size-1-i ; j++) {
                int m=candles.get(j);
                int n=candles.get(j+1);
                if (m<n){
                    candles.set(j,n);
                    candles.set(j+1,m);
                }

            }

        }
        System.out.println(candles.toString());
        int count=1;
        for (int i = 0; i < size-1; i++) {

            if (candles.get(i)>candles.get(i+1)){
                break;
            }else if(candles.get(i)==candles.get(i+1)){
                count++;
            }
        }




       */
        int max=candles.get(0);
        int maxCount=0;
        for (Integer candle : candles) {
            if (max == candle) {
                maxCount++;

            } else if (max < candle) {
                max = candle;
                maxCount = 1;
            }

        }



        return maxCount;
    }
}
