import java.util.Scanner;
public class Main6 {
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
            Main6 instance = new Main6();
            instance.input = new Scanner(System.in);
            String output = instance.nonStart();
            System.out.println(output);

        }
    }

