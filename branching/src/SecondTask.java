public class SecondTask {
    public static void calc(double a, double b, double c, double d) {
        double max;
        if (a < b){b=a;}
        if (c < d){d=c;}
        max = Math.max(d, b);
        System.out.println(max);
    }
}
