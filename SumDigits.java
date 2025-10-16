
package sumdigits;
import java.util.Scanner;
public class SumDigits {

    public static void main(String[] args) {
   Scanner sd = new Scanner(System.in);
        System.out.println("Enter the number you want to know sumdigits of that's number: ");
        int num = sd.nextInt();
        int sum=0;
        for(int i=num;num>0;){int d=num%10;
        sum+=d;
        num=num/10;}
        System.out.println(sum);
        
    
    }

}
