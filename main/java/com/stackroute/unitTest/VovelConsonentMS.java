package com.stackroute.unitTest;

public class VovelConsonentMS {

    public String vovelConsonentMS(String indata){
        String data = "";
        String outputstr = "";
        int numflag = 0;

        data = indata;
        for (int i=0; i<data.length(); i++){
            char c = data.charAt(i);
            if (Character.isDigit(c)){
                System.out.println("Invalid string");
                numflag =1;
                return ("Invalid String");
            }
            else {
                switch (c){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u': outputstr += "Vovel ";break;
                    case ' ': break;
                    default : outputstr += "Consonent ";

                }
            }
        }

        if(numflag !=   1)
            return (outputstr);

        return ("error");

    }
}
