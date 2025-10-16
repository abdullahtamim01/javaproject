
package factorial;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to know thats (Factorial): ");
        int n = sc.nextInt();
        long factor = 1;
        for(int i=1;i<=n;i++){
            factor*=i;}
        
        System.out.println("Fatorial of "+n+" is :"+factor);
        
    }

}
