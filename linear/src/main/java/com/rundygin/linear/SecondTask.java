package com.rundygin.linear;

public class SecondTask {

    static public void calc(double a,double b,double c){
        double z = (b + Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+1/(b*b);
        System.out.println("received value: "+z);
    }
}
