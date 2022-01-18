import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("write your choice (1 - 8)\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter the number\n");
                int a = input.nextInt();
                FirstTask.calc(a);
            }
            case 2 -> {
                System.out.println("write a,b and step h\n");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double h = input.nextDouble();
                SecondTask.calc(a, b, h);
            }
            case 3 -> {
                ThirdTask.calc();
            }
            case 4 -> {
                FourthTask.calc();
            }
            case 5 -> {
                System.out.println("Enter e\n");
                double e = input.nextDouble();
                FifthTask.calc(e);
            }
            case 6 -> {
                System.out.println("Enter your symbol\n");
                String x = input.next();
                SixthTask.calc(x);
            }
            case 7 -> {
                System.out.println("Enter m and n\n");
                int m = input.nextInt();
                int n = input.nextInt();
                SeventhTask.calc(m, n);
            }
            case 8 -> {
                System.out.println("Enter number x and y\n");
                String x = input.next();
                String y = input.next();
                EightthTask.calc(x, y);
            }

            default -> {
                System.out.println("You entered a number that is not in the range from 1 to 6\n");
            }
        }
    }
}