package com.rundygin.linear;

public class ThirdTask {
    static public void calc(double x,double y){
        double z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))*Math.tan(x*y);
        System.out.println("received value: "+z);
    }
}
