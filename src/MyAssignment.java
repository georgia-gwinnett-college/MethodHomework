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
  
    public static void main(String[] args) {
         MyAssignment ma = new MyAssignment(); 
        System.out.println( ma.birthdayNam("Jah));
       System.out.println(ma.sumDigits(5678));                                     
                                        
    

    }

     public String reverseDoubleChar(String word)
{
      String result = "";
      for(int i = word.length()-1; i >= 0; i--)
      {
           result += word.charAt(i) + "" + word.charAt(i); 
      }
      return result; 
}
    
    
    public int sumDigits(int n) {
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
    
    public String birthdayName(String name){
return ("Happy Birthday " + name + "!");
}
    
    
    
    
    
    }


