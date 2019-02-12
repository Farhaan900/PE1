package com.stackroute.unitTest;

public class NumberEqualsMS {
    public String numberEqualsMS(int num,int val){

        if (num<val)
            return ("less");
        else if (num>val)
            return("more");
        else
            return ("equal");
    }
}
