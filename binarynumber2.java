package cs_journal;
import java.util.*;
public class binarynumber2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int i=0;
        int b=0;
        int temp=num;
        while(temp>0)
        {
            b=b+(int)(temp%2*Math.pow(10,i++));
            temp=temp/2;
        }
        System.out.println("The binary number for "+num+" is "+b);
    }
}
/*              Variable Description
* name                 purpose             type
* num             to accept number         int
* temp          for temporary storage      int
* b             to store binary number     int
* i              for calculations          int
*/

