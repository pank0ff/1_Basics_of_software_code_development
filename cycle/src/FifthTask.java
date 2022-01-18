public class FifthTask {
    public static void calc(double e) {
        int n = 1;
        double sum = 0;
        while ((1 / Math.pow(2, n) + 1 / Math.pow(3, n)) >= Math.abs(e)) {
            sum += (1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            n++;
        }
        System.out.println("sum: " + sum);
    }
}
