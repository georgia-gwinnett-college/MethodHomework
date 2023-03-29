/**
 * class: HasPalindrome
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 *  * description:  The program should state if the given input is a Palindrome or not
 *  A palindrome is a string that reads the same backward as forward. For example, "racecar" and "level" are palindromes.*/
import java.util.Scanner;
public class HasPalindrome {
    private Scanner input;

    public boolean hasPalindrome() {
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HasPalindrome instance = new HasPalindrome();
        instance.input = new Scanner(System.in);
        boolean output = instance.hasPalindrome();
        System.out.println(output);
    }
}
