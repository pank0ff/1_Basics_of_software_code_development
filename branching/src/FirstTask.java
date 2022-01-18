public class FirstTask {
    public static void calc(double a, double b) {
        if (a<=0 || b<=0){
            System.out.println("no such triangle exists");
            return;
        }
        if (a + b >= 180) {
            System.out.println("no such triangle exists");
        return;
        }
        if ((a+b) == 90 || a==90 || b == 90){
            System.out.println("right triangle");
            return;
        }
        System.out.println("triangle exists");
    }
}
