
package reversenumber;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter three digit number");
        int number = sc.nextInt();
        if (number >99 && number <1000)
        {
            int hundreds = (number/100);
            int tens = (number/10)%10;
            int ones = (number%10);
            int reverseNumber = ((ones *100)+(tens *10)+(hundreds));
            System.out.println("The reverse of that number that you typed:  "+reverseNumber);
        }
        else
        {
            System.out.println("We telled three digit number");
        }
        
    }

}
