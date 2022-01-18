package com.rundygin.linear;

public class FifthTask {

    static public void calc(int T){
        int hours = T/3600;
        int minutes = (T - hours*3600)/60;
        int seconds = T - hours*3600 - minutes * 60;
        System.out.println("time has passed: " + hours + "h "+ minutes + "m "+ seconds + "s");
    }
}
