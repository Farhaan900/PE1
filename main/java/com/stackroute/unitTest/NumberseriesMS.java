package com.stackroute.unitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberseriesMS {

    public long numberSeriesMS (int indata){

        String data = new String(),out ="";
        int num;
        System.out.print("Enter number : ");

        num = indata;

        for (int i =1 ;i<=num;i++)
            for(int j=1;j<=i;j++){
                out+= i;
            }

        return (Long.parseLong(out));

    }
}
