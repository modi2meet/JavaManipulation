package cs_journal;
import java.util.*;
public class triangular14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i,sum=0;
        boolean flag=false;
        for(i=1;i<=num;i++)
        {
            sum+=i;
            if(sum==num)
            flag=true;
        }
        if(flag)
        System.out.println("It is a triangular number");
        else
        System.out.println("It is NOT a triangular number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* i             loop control variable      int
* sum             to calculate sum         int
* flag        for conditional checking     int
*/