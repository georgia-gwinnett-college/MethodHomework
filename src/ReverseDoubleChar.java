import java.util.Scanner;
public class reverseDouble {
    private Scanner input;

    public String reverseDouble() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        reverseDouble instance = new reverseDouble();
        instance.input = new Scanner(System.in);
        String output = instance.reverseDouble();
        System.out.println(output);

        }
    }

