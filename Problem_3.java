
import javax.swing.JOptionPane;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143?
 * 
 * @author Matthew Van der Bijl
 */
public final class Problem_3 implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Problem_3().run();
    }

    @Override
    public void run() {
        long num = 600851475143L;
        int largestPrimeFactor = 0;

        for (int i = 1; i < Math.sqrt(600851475143L); i++) {
            if ((num % i) == 0) {
                num /= i;
                largestPrimeFactor = i;
            }
        }

//        System.out.println(largestPrimeFactor);
        JOptionPane.showMessageDialog(null, largestPrimeFactor);
    }
}
