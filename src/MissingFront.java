import java.util.Scanner;
/**
 * class: MissingFront
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should return a given string without the first 3 chars
 */
public class MissingFront {
    private Scanner input;

    public String missingFront(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        result = result + str.substring(3);
        return result;
    }

    public static void main(String[] args) {
        MissingFront instance = new MissingFront();
        instance.input= new Scanner(System.in);
        String output = instance.missingFront();
        System.out.println(output);
    }
}
