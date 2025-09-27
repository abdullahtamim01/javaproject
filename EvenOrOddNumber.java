
package evenoroddnumber;
import java.util.Scanner;
public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double number=sc.nextDouble(); 
        if(number%2 ==0)
        {
            System.out.println("Is even:"+number);
            
        }
        else if(number%2!=0)
        {
            System.out.println(" is odd number:"+number);
        }
      
      
      
        
    }

}
