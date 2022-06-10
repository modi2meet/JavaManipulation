package cs_journal;
import java.util.*;
public class automorphic9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sq=(int)Math.pow(num,2);
        int div,temp=num,ctr=0;
        while(temp>0)
        {
            temp/=10;
            ctr++;
        }
        div=(int)Math.pow(10,ctr);
        if((sq%div)==num)
        System.out.println("It is an automorphic number");
        else
        System.out.println("It is NOT an automorphic number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* sq       storing sum of square of digits int
* div             for calculations         int
* temp          for temporary storage      int
* ctr                 to count             int
*/


