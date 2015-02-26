package project_2;

import javax.swing.JOptionPane;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.F
 */
public class Problem_2 implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Problem_2().run();
    }

    @Override
    public void run() {
        int total = 0;

        for (int i = 1; true; i++) {
            long num = fib(i);
            if (num > 4000000) {
                break;
            }
            if (isEven(num)) {
                total += num;
            }
        }

//        System.out.println(total);
        JOptionPane.showMessageDialog(null, total);
    }

    private long fib(long n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    private boolean isEven(long num) {
        return (num % 2) == 0;
    }
}
