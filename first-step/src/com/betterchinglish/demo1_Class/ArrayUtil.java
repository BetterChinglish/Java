package com.betterchinglish.demo1_Class;

public class ArrayUtil {
    private ArrayUtil(){

    }

    public static int ArraySum(int[] arr) {

        /*
        *
        *
        * */
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        return sum;
    }
}
