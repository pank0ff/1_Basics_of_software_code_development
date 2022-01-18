
import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        System.out.println("write your choice (1 - 5)\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1 -> {
                System.out.println("Enter the first and second angle\n");
                double a = input.nextDouble();
                double b = input.nextDouble();
                FirstTask.calc(a,b);
            }
            case 2 -> {
                System.out.println("write a,b,c,d\n");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double d = input.nextDouble();
                SecondTask.calc(a,b,c,d);
            }
            case 3 -> {
                System.out.println("Enter the coordinates of the first, second and third point\n");
                double x1 = input.nextDouble();
                double y1 = input.nextDouble();
                double x2 = input.nextDouble();
                double y2 = input.nextDouble();
                double x3 = input.nextDouble();
                double y3 = input.nextDouble();
                ThirdTask.calc(x1,y1,x2,y2,x3,y3);
            }
            case 4 -> {
                System.out.println("Enter the dimensions of the rectangular hole\n");
                double A = input.nextDouble();
                double B = input.nextDouble();
                System.out.println("Enter brick dimensions\n");
                double x = input.nextDouble();
                double y = input.nextDouble();
                double z = input.nextDouble();
                FourthTask.calc(A,B,x,y,z);
            }
            case 5 ->{
                System.out.println("Enter X\n");
                double x = input.nextDouble();
                FifthTask.calc(x);
            }

            default -> {System.out.println("You entered a number that is not in the range from 1 to 6\n");}
        }
}
}
