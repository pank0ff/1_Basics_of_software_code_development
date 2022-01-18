public class FourthTask {
    public static void calc(double a, double b, double x, double y, double z) {
        if ((a>=x && b>=y) || (a>=y && b>=x)){System.out.println("will pass"); return;}
        if ((a>=x && b>=z) || (a>=z && b>=x)){System.out.println("will pass"); return;}
        if ((a>=z && b>=y) || (a>=y && b>=z)){System.out.println("will pass"); return;}
        System.out.println("won't pass");
    }
}
