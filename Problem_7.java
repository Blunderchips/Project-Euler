
import javax.swing.JOptionPane;

/**
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_7 implements Runnable {

    public static void main(String[] args) {
        new Problem_7().run();
    }

    @Override
    public void run() {
        int i = 0;
        int j = 0;

        while (true) {
            if (isPrime(i)) {
                j++;
                if (j == 10001) {
                    JOptionPane.showMessageDialog(null, i);
                    break;
                }
            }
            i++;
        }
    }

    private boolean isPrime(int num) {
        if (num != 2) {
            if (num % 2 == 0 || num == 1) {
                return false;
            } else {
                for (int i = 3; i < Math.sqrt(num) + 1; i += 2) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
