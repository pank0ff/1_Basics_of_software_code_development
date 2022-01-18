public class EightthTask {
    public static void calc(String x, String y) {
        char[] array1 = x.toCharArray();
        char[] array2 = y.toCharArray();
        for (char i : array1) {
            for (char t : array2) {
                if (i == t) {
                    System.out.println(i);
                }
            }
        }
    }
}

