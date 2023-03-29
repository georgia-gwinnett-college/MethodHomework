import java.util.Scanner;
/**
 * class: MyAssignment
 * @author: Jah St.Aimee
 * @date: March 28, 2023
 * @version: 1.0
 * @course: ITEC 2140 - 05 Spring 2023
 * description:  The program should get a string name, e.g. "Susan", return a message of the form "Happy Birthday Susan!".
 */
public class MyAssignment {
    private Scanner input;
    public static void main(String[] args) {
        BirthdayName instance = new BirthdayName();
        instance.input = new Scanner(System.in);
        String output = instance.birthdayName();
        System.out.println(output);


    }

    public String BirthdayName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        String result = "";
        result = result + "Happy Birthday " + name + "! ";
        return result;
    }
    public String MissingFront(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        result = result + str.substring(3);
        return result;
    }
    public String ReverseDoubleChar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }
    public String SwapEnds(){
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
    public String EveryOther(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i += 2){
            result = result + str.charAt(i);
        }
        return result;
    }
    public int SumDigits() {
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
    public int LuckySum() {
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
    public boolean PowerOfTwo() {
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
    public boolean HasPalindrome() {
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }


