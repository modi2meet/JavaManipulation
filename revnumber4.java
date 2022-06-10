package cs_journal;
import java.util.*;
public class revnumber4
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
        System.out.println("The reverse of the number is "+rev);
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int 
* temp          for temporary storage      int
* rev           to store reverse form      int
*/