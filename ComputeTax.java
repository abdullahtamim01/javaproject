
package computetax;
import java.util.Scanner;
public class ComputeTax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("If are you single Please click-1");
        System.out.println("If are you Marriage Please click-2");
        System.out.println("If are you Window please click-3");
        int status=sc.nextInt();
        System.out.println("Enter your income from each month:");
        double income=sc.nextDouble();
        double tax=0;
        if(status==1)
        {
            if(income<=10000)
                tax=income*0.05;
            else if(income<=20000)
            tax=income*0.10;
            else if(income<=30000)
                tax=income*0.15;
        }  
        else if (status==2)
        {
            if(income<=10000)
                tax=income*0.10;
            else if(income<=20000)
                tax=income*0.20;
            else if(income<=30000)
                tax=income*0.30;
        }
        else if(status==3)
        {
            if(income<=10000)
                tax=income*0.03;
            else if (income<=20000)
                tax=income*0.06;
            else if(income<=30000)
                    tax=income*0.09;
        }
        System.out.println("You tax is $"+tax);
        
    }
      
}
