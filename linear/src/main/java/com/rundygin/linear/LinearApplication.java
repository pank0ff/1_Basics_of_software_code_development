package com.rundygin.linear;


import java.util.Scanner;

public class LinearApplication {

    public static void main(String[] args) {
    System.out.println("write your choice (1 - 6)\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
    switch(choice){
    case 1 -> {
        System.out.println("write a,b,c\n");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        FirstTask.calc(a,b,c);
    }
    case 2 -> {
        System.out.println("write a,b,c\n");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        SecondTask.calc(a,b,c);
    }
    case 3 -> {
        System.out.println("write x,y\n");
        double x = input.nextDouble();
        double y = input.nextDouble();
        ThirdTask.calc(x,y);
    }
    case 4 -> {
        System.out.println("write R\n");
        double R = input.nextDouble();
        FourthTask.calc(R);
    }
        case 5 ->{
            System.out.println("write T\n");
            int T = input.nextInt();
            FifthTask.calc(T);
        }
        case 6 -> {
            System.out.println("write x,y\n");
            double x = input.nextDouble();
            double y = input.nextDouble();
            SixthTask.calc(x,y);
        }
        default -> {System.out.println("You entered a number that is not in the range from 1 to 6\n");}
    }
}
}
