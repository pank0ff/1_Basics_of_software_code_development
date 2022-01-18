public class SeventhTask {
    public static void calc(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.println("dividers of " + i + ":");
            for (int y = 2; y < i; y++) {
                if (i % y == 0) System.out.println(y);
            }
        }
    }
}
