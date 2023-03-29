/**
 * class: LuckySum
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should get three int values, a, b, and c, return their sum.
 * However, if one of the values is 13 then it does not count towards the sum and the values to its right do not count.
 */
import java.util.Scanner;
public class LuckySum {
    private Scanner input;

    public int luckySum() {
        System.out.println("Enter an integer: ");
        int a = input.nextInt();
        System.out.println("Enter another  integer: ");
        int b = input.nextInt();
        System.out.println("Enter another integer: ");
        int c = input.nextInt();
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }
    public static void main(String[] args) {
        LuckySum instance = new LuckySum();
        instance.input = new Scanner(System.in);
        int output = instance.luckySum();
        System.out.println(output);

    }
}
