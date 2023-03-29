/**
 * class: NonStart
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should reverse a given string, double, and print each value twice.
 */
import java.util.Scanner;
public class MyAssignment {
    private Scanner input;

    public String nonStart() {
        String result = "";
        System.out.println("Enter a string: ");
        String a = input.nextLine();
        System.out.println("Enter another string: ");
        String b = input.nextLine();

        if (a.length() > 1 && b.length() > 1) {
            result = result + a.substring(1) + b.substring(1);
        }
        return result;
    }
        public static void main (String[]args) {
            MyAssignment instance = new MyAssignment();
            instance.input = new Scanner(System.in);
            String output = instance.nonStart();
            System.out.println(output);

        }
    }

