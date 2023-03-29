/**
 * class: Fibonacci
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should print a working fibonnaci sequence.
 * The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones.
 */
import java.util.Scanner;
public class Fibonacci {
    private Scanner input;

    public int fibonacci() {
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public int fibonacci() {
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Fibonacci instance = new Fibonacci();
        instance.input = new Scanner(System.in);
        int output = instance.fibonacci();
        System.out.println(output);
    }

}
