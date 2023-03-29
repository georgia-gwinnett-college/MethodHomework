/**
 * class: SwapEnds
 *@author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should get a string, return a new string where the first and last characters have been exchanged.
 */
import java.util.Scanner;
public class SwapEnds {

    private Scanner input;

    public String swapEnds(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        String first;
        String last;
        String mid;
        if(str.length() > 1){
            first = str.substring(0,1);
            last = str.substring(str.length()-1);
            mid = str.substring(1, str.length()-1);
            return result = result + last + mid + first;
        }
        return result = result + str;
    }

    public static void main(String[] args) {
        SwapEnds instance = new SwapEnds();
        instance.input = new Scanner(System.in);
        String output = instance.swapEnds();
        System.out.println(output);
    }
}
