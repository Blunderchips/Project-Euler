
import javax.swing.JOptionPane;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem_1 implements Runnable {

    public static void main(String[] args) {
        new Problem_1().run();
    }

    @Override
    public void run() {
        int total = 0;

        for (int i = 0; i < 1000; i++) {
            if ((i % 3) == 0) {
                total += i;
            } else if ((i % 5) == 0) {
                total += i;
            }
        }

        // System.out.println(total);
        JOptionPane.showMessageDialog(null, total);
    }
}
