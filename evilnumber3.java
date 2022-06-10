package cs_journal;
import java.util.*;
public class evilnumber3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i=0;
        int b=0,ctr=0;
        int temp=num;
        while(temp>0)
        {
            b=b+(int)(temp%2*Math.pow(10,i++));
            temp=temp/2;
        }
        System.out.println("Binary form is "+b);
        while(b>0)
        {
            if(b%10==1)
            ctr++;
            b/=10;
        }
        if(ctr%2==0)
        System.out.println("It is an evil number");
        else
        System.out.println("It is NOT an evil number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* b             to store binary number     int
* i               for calculations         int
* ctr                 to count             int
*/