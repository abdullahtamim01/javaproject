
package subtractionquiz;
import java.util.Scanner;
import java.util.Random;
public class SubtractionQuiz {
    public static void main(String[] args) {
     Random ra=new Random();
     Scanner sc=new Scanner(System.in);
     int number1=ra.nextInt(0,10);
     int number2=ra.nextInt(0,10);
     System.out.println("What is "+number1+"-" +number2+"?");
     int answer=sc.nextInt();
     if(answer == number1 -number2)
     {
     System.out.println("Correct Welldone ");   
     }
     else 
     {
     System.out.println("Incorrect try again");
     }
    }

}
