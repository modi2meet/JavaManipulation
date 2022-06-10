package cs_journal;
import java.util.*;
public class smith13
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();                         
        int sf=0,sd=0,i,ctr=0;
        int temp=num,temp2,ld; 
        for (i=1;i<=num;i++)
        {
            if (num%i==0)
            ctr++;
        }
        if (ctr==2)
        {
            System.out.println("It is a prime number");
            System.exit(0);
        }
        while (temp>0)
        {
            ld=temp%10;
            sd+=ld;                               
            temp=temp/10;
        }       
        while (num%2==0)
        {
            sf+=2;
            num=num/2;
        }           
        for (i=3;i<=(num/2);i+=2)
        {
            while (num%i==0)
            {
                temp2=i;
                while (temp2>0)
                {
                    ld=temp2%10;
                    sf+=ld;
                    temp2=temp2/10;
                }
                num=num/i;
            }
        }
        if (num>2)
        {
            temp2=num;
            while (temp2>0)
            {
                ld=temp2%10;
                sf+=ld;
                temp2=temp2/10;
            }
        }
        if (sf==sd)
            System.out.println("It is a smith number");
        else
            System.out.println("It is NOT a smith number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* temp2         for temporary storage      int
* ld           to calculate last digit     int
* sf                sum of factors         int
* sd                sum of digits          int
* i             loop control variable      int
* ctr                 to count             int
*/

