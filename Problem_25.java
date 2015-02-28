
import java.math.BigInteger;

/**
 * What is the first term in the Fibonacci sequence to contain 1000 digits?
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_25 implements Runnable {

    public static void main(String[] args) {
        new Problem_25().run();
    }

    @Override
    public void run() {

        BigInteger current = new BigInteger("1");
        BigInteger previous = new BigInteger("0");

        for (int i = 1; true; i++) {
            long length = length(current);

            if (length == 1000) {
                System.out.println("\n" + i + " " + length);
                break;
            }

            BigInteger temp = current.add(previous);
            previous = current;
            current = temp;
        }
    }

    private long length(BigInteger num) {
        return num.toString().length();
    }
}
