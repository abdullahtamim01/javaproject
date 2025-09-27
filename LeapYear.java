
package leapyear;//بر چهار تقسیم شود اما بر صد تقسیم نشود
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year you like to know, that is a leap year?");
        int year=sc.nextInt();
        if(year % 4==0 && year % 100 !=0)
        {
            System.out.println("Is a leapYear ");
        }
        else 
        {
            System.out.println("Is not a LeapYear");
        }
    }

}
