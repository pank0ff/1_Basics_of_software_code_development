import java.math.BigInteger;

public class FourthTask {
    public static void calc() {
        BigInteger multiply = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            multiply = multiply.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("multiply: " + multiply);
    }
}
