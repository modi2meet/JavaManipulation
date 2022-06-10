package cs_journal;
import java.util.Scanner;
public class primefactors12
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i,num=sc.nextInt();
        while (num%2==0)
        {
            System.out.print(2 + " ");
            num=num/2;
        }
        for (i=3;i<=(num/2);i+=2)
        {
            while (num%i==0)
            {
                System.out.print(i + " ");
                num/=i;
            }
        }
        if (num>2)
            System.out.print(num);
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* i             loop control variable      int
*/