
package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number that you want to know that's Fibonacci series");
        int n= sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }

}
