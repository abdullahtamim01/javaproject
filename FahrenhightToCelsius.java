
package fahrenhighttocelsius;
import java.util.Scanner;
public class FahrenhightToCelsius {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("PLZ enter the fahrenhight");
        double fahrenhight = sc.nextDouble();
        double celsius = (5.0/9)*(fahrenhight-32);
        
        System.out.println("Celsius is: "+celsius);
    }

}
