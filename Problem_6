
import javax.swing.JOptionPane;

/**
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_6 implements Runnable {

    public static void main(String[] args) {
        new Problem_6().run();
    }

    @Override
    public void run() {
        long a = 0;
        long b = (long) Math.pow(((100 / 2) * (2 + (100 - 1))), 2);

        for (int i = 0; i <= 100; i++) {
            a += Math.pow(i, 2);
        }

//        System.out.println(b - a);
        JOptionPane.showMessageDialog(null, (b - a));
    }
}
