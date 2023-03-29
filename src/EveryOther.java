/**
 * class: EveryOther
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should get string, return a new string made of every other character starting with the first character.
 */
import java.util.Scanner;
public class EveryOther {

    private Scanner input;

    public String everyOther(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i += 2){
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        EveryOther instance = new EveryOther();
        instance.input = new Scanner(System.in);
        String output = instance.everyOther();
        System.out.println(output);
    }
}
