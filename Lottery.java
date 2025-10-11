
package lottery;
import java.util.Scanner;
import java.util.Random;
public class Lottery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PLS guess two digit number");
        int guess = in.nextInt();
        Random ni = new Random();
        int number = ni.nextInt(10,99);
        
        if (number==guess)
        {
            System.out.println("Oh!Very good, You have won 10000$ ");
        }
        else if (guess+1 ==number || guess-1==number)
        {
            System.out.println("you won 3000");
        }
        else if (guess!=number)
        {
            System.out.println("You won 0");
        }
    }
}
