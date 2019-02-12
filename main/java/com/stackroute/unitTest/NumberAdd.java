package com.stackroute.unitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberAdd {

    public int numberAdd(String indata) {

        String data = new String();
        int sum = 0;
        String[] arr;

        data = indata;
        arr = data.split(" ");

        for (String x : arr) {
            sum += Integer.parseInt(x);
        }

        return sum;
    }



}
