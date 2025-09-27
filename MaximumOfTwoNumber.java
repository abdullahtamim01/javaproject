
package maximumoftwonumber;
import java.util.Scanner;
public class MaximumOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int f=sc.nextInt();
        System.out.println("Enter the scond number: ");
        int s=sc.nextInt();
        if(f>s)
        {
            System.out.println("Greater "+f);
        }
        else
        {
            System.out.println("Greater "+s);
        }
      
    }

}
