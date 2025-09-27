
package computerectangle;
import java.util.Scanner;
public class ComputeRectangle {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the Lenght");
        double l=input.nextDouble();
        System.out.println("Enter the width:");
        double w=input.nextDouble();
        double perimeter=l*w;
        System.out.println("The perimeter of rectangle is:"+perimeter);
    }

}
