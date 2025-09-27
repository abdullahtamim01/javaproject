
package computeareaofcircle;
import java.util.Scanner;
public class ComputeAreaOfCircle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the redius:");
        double r=sc.nextDouble();
        double area=r*r*3.1415;
        System.out.println(area+" ");
    }

}
