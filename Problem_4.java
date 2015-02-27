
import javax.swing.JOptionPane;

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.A
 * palindromic number reads the same both ways. The largest palindrome made from
 * the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_4 implements Runnable {

    public static void main(String[] args) {
        new Problem_4().run();
    }

    @Override
    public void run() {
        int largest = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int num = i * j;
                if (isPalindrome(num) && num > largest) {
                    largest = num;
                }
            }
        }

//        System.out.println(largest);
        JOptionPane.showMessageDialog(null, largest);
    }

    private boolean isPalindrome(int number) {
        return (number + "").equals(this.reverse(number + ""));
    }

    private String reverse(String str) {
        String output = "";
        for (int i = str.length() - 1; i != -1; i--) {
            output += str.charAt(i);
        }
        return output;
    }
}
