
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Using
 * <a href="https://projecteuler.net/project/resources/p022_names.txt">names.txt</a>,
 * a 46K text file containing over five-thousand first names, begin by sorting
 * it into alphabetical order. Then working out the alphabetical value for each
 * name, multiply this value by its alphabetical position in the list to obtain
 * a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 *
 * @author Matthew Van der Bijl
 */
public final class Problem_22 implements Runnable {

    public static void main(String[] args) {
        new Problem_22().run();
    }

    @Override
    public void run() {
        List<String> names = new ArrayList<>();
        final String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        try {
            Scanner sc = new Scanner(new File("p022_names.txt"));
            while (sc.hasNextLine()) {
                String ln[] = sc.nextLine().split("\"");
                for (int i = 1; i < ln.length; i += 2) {
                    names.add(ln[i]);
                }
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe);
        }

        for (int i = 0; i < names.size(); i++) {
            for (int j = i; j < names.size(); j++) {
                if (names.get(i).compareTo(names.get(j)) > 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(i));
                    names.set(i, temp);
                }
            }
        }
//        
//        for (String name : names) {
//            System.out.println(name);
//        }
//        
        long totalScore = 0;
        for (int i = 0; i < names.size(); i++) {
            int score = 0;
            for (int j = 0; j < names.get(i).length(); j++) {
                for (int k = 0; k < alphabet.length(); k++) {
                    if (names.get(i).charAt(j) == alphabet.charAt(k)) {
                        score += k + 1;
                        break;
                    }
                }
            }
            totalScore += score * (i + 1);
        }

//        System.out.println(totalScore);
        JOptionPane.showMessageDialog(null, totalScore);
    }
}
