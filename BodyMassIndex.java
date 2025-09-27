
package bodymassindex;
import java.util.Scanner;
public class BodyMassIndex {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Height: ");
        double h=sc.nextDouble();
        System.out.println("Enter your Weight:");
        double w=sc.nextDouble();
        double BMI=w/(h*h);
        if (BMI<18)
        {
            System.out.println("Underweight");
        }
        else if(BMI>=18 && BMI<25)
        {
            System.out.println("Normal weight");
        }
        else if(BMI>=25 && BMI<30)
        {
            System.out.println("Over weight");
            
        }
        else if (BMI<=35)
        {
            System.out.println("Obese");
        }
    }

}
