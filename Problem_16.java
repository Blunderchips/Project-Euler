
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 * What is the sum of the digits of the number 2^1000?.
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_16 implements Runnable {

    public static void main(String[] args) {
        new Problem_16().run();
    }

    @Override
    public void run() {
        long total = 0;
        for (char i : new BigInteger("2").pow(1000).toString().toCharArray()) {
            total += Integer.parseInt(i + "");
        }
//        System.out.println(total);
        JOptionPane.showMessageDialog(null, total);
    }
}
