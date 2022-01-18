public class FifthTask {
    public static void calc(double x) {
        double y;
        if (x<=3){
             y = x*x-3*x+9;
        }else {
             y = 1/(x*x*x+6);
        }
        System.out.println(y);
    }
}
