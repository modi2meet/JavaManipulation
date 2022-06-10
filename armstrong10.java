package cs_journal;
import java.util.*;
public class armstrong10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num,sum=0;
        while(temp>0)
        {
            sum+=Math.pow(temp%10,3);
            temp/=10;
        }
        if(sum==num)
        System.out.println("It is an armstrong number");
        else
        System.out.println("It is NOT an armstrong number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* sum             to calculate sum         int
*/


