package cs_journal;
import java.util.*;
public class twistedprime8

{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i,ctr=0;
        for (i=1;i<=num;i++)
        {
            if(num%i==0)
                ctr++;
        }
        if(ctr==2)
        {
            int temp,rev=0;
            temp=num;
            while(temp>0)
            {
                rev=rev*10+(temp%10);
                temp/=10;
            }
            if(num==rev)
                System.out.println("The entered prime number is a twisted prime");
            else
                System.out.println("The entered prime number is NOT a twisted prime");
        }
        else
            System.out.println("The number is NOT prime ");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* rev           to store reverse form      int
* i             loop control variable      int
* ctr                 to count             int
*/
