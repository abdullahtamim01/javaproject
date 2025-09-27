
package simpleinterest;
import java.util.Scanner;
public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal price: ");
        int pp=sc.nextInt();
        System.out.println("Enter the Rate: ");
        int r=sc.nextInt();
        System.out.println("Enter the Time: ");
        int t=sc.nextInt();
        int Interest=(pp*r*t)/100;
        System.out.println("The Interset number is: "+Interest);
        
    }

}
