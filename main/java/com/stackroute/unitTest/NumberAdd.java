package com.stackroute.unitTest;

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
