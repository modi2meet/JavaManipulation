package cs_journal;
import java.util.*;
public class primenumber6

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
        System.out.println("The number is prime ");
        else
        System.out.println("The number is NOT prime ");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* ctr                  to count            int
* i             loop control variable      int
*/

