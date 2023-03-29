/**
 * class: PowerOfTwo
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should return true if the given input is a power of 2
 */
import java.util.Scanner;
public class PowerOfTwo {
    private Scanner input;

    public boolean powerOfTwo() {
        System.out.println("Enter an integer to see if it is a power of 2: ");
        int n = input.nextInt();
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }

    public static void main(String[] args) {
        PowerOfTwo instance = new PowerOfTwo();
        instance.input = new Scanner(System.in);
        boolean output = instance.powerOfTwo();
        System.out.println(output);
    }
}
