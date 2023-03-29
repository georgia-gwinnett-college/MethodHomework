/**
 * class: SumDigits
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should return sum of digits.
 */
import java.util.Scanner;
public class SumDigits {
    private Scanner input;


    public int sumDigits() {
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        SumDigits instance = new SumDigits();
       instance.input = new Scanner(System.in);
        int output = instance.sumDigits();
        System.out.println(output);
    }
}
