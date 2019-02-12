package com.stackroute.unitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class NumberSortMS {

    public int numberSortMS(int indata){


        String data = "",temp="";
        int num, sum = 0,out;
        String[] arr;

        data = Integer.toString(indata);
        arr = data.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for (String x: arr){
            num=Integer.parseInt(x);
            if(num%2==0){
                sum+=num;
            }
        }

        System.out.print("Sorted number in non-increasing order : ");
        for (String x: arr) {
            System.out.print(x);
            temp+=x;
        }
        System.out.println("");
        System.out.println("Sum of even numbers : "+sum);

        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");
        out = Integer.parseInt(temp);

        return out;
    }
}
