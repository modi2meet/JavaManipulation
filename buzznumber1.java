package cs_journal;
import java.util.*;
public class buzznumber1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num%10==7||num%7==0)
        System.out.println("It is a buzz number");
        else
        System.out.println("It is NOT a buzz number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
*/




