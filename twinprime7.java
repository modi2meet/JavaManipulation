package cs_journal;
import java.util.*;
public class twinprime7

{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int i,ctr1=0,ctr2=0;
        for (i=1;i<=Math.max(num1,num2);i++)
        {
            if(num1%i==0)
            ctr1++;
            if(num2%i==0)
            ctr2++;
        }
        if(ctr1==2&&ctr2==2&&Math.abs(num2-num1)==2)
        System.out.println("The numbers are twin prime ");
        else
        System.out.println("The numbers are NOT twin prime ");
    }
}
/*              Variable Description
* name                 purpose             type 
* num1            to accept a number       int
* num2          to accept other number     int
* ctr1            to count for num1        int
* ctr2            to count for num2        int
* i             loop control variable      int
*/

