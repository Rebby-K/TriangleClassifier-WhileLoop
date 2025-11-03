package Unit3.U3Assignments;

import java.util.Scanner;

public class WhileLoopLab {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count ++;
        }

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number between 1 and 1000: ");
        num = sc.nextInt();

        while (num < 1 || num > 1000) {
            System.out.println("Invalid! Enter a number between 1 and 1000: ");
            num = sc.nextInt();
        }
        System.out.println("Valid number: " + num);

        System.out.println("Enter a word (a - c): ");
        String word = sc.next();

        while (checkInput(word)) {
            System.out.println("Invalid word! Enter a word between 'a' and 'c': ");
            word = sc.next();
        }
        System.out.println("Valid word: " + word);

    }

    public static boolean checkInput (String word) {
        return word.compareTo("a") >= 0 && word.compareTo("cz") <= 0;
    }
}
