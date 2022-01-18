public class ThirdTask {
    public static void calc(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){System.out.println("The points lie on the same line");
    }else{
            System.out.println("Points do not lie on the same line");
        }
}
}
