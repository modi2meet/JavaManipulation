package cs_journal;
import java.util.*;
public class adamnumber11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sq1=(int)Math.pow(num,2);
        int rev=0,temp=num;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        int sq2=(int)Math.pow(rev,2);
        rev=0;
        temp=sq2;
        while(temp>0)
        {
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(rev==sq1)
        System.out.println("The number "+num+" is an adam number");
        else
        System.out.println("The number "+num+" is NOT an adam number");
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* rev           to store reverse form      int
* sq1               squaring num           int
* sq2               squaring rev           int
*/