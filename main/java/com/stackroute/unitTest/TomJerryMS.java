package com.stackroute.unitTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TomJerryMS {

       public String tomJerry (int indata) {
            int data;
            int num;

            data = indata;
            num = data;

            if (num >= 20 && num <= 30) {
                if (num % 2 != 0) {
                    return ("Tom");
                } else {
                    return ("Jerry");
                }
            }
            return ("Error");
        }
}
