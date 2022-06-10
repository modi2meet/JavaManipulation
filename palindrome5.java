package cs_journal;
import java.util.*;
public class palindrome5
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp,rev=0;
        temp=num;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(num==rev)
        System.out.println("The entered number is a palindrome");
        else
        System.out.println("The entered number is NOT a palindrome");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* rev           to store reverse form      int
*/