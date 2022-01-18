public class SecondTask {
    public static void calc(double a, double b, double h) {
        for (double i = a; i <= b; i += h) {
            if (i > 2) System.out.println(i + " ");
            else {
                if (i == 0) System.out.println(0);
                else
                    System.out.println(-i + " ");
            }
        }
    }
}

