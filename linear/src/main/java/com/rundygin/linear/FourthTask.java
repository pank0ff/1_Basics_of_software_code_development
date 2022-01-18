package com.rundygin.linear;

public class FourthTask {
    static public void calc(double R){
        double fractionalPart = R % 1;
        double wholePart = R - fractionalPart;
        double number = fractionalPart*1000 + wholePart/1000;
        String result = String.format("%.3f",number);
        System.out.println("final number: "+ result);
    }
}
