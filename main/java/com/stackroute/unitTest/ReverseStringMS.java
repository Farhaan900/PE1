package com.stackroute.unitTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringMS {

    public String reverseStringMS(String indata){

        String data = new String();
        String outdata = "";

        data = indata;

        for (int i = data.length()-1;i>=0;i--){
            outdata += data.charAt(i);
        }

        return outdata;
    }
}
