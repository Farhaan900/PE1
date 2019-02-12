package com.stackroute.unitTest;

public class SubstrRepeatMS {

        public String substrRepeatMS(String indata1,int indata2){

        String data = "";
        int num =0;

        String out = "",addr = "";

        data = indata1;
        num=indata2;

        addr = data.substring(data.length()-num);
        out = data;

        for(int i = 1; i<=num ; i++){
            out+=addr;
        }
        return (out);
    }
}
