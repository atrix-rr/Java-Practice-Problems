import java.util.*;
class Discount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Amount");
        int B=sc.nextInt();
        

        if(B>2000)
        {
            int b= B-(15/100*B);
            System.out.println("Bill is:"+b);
        }
        else if( B>1000 && B<2000)
        {
            int C= B - (10/100*B);
            System.out.println("Bill is:"+C);
        }
        else
        {
            System.out.println("No Discount is possible");
        }
    }
}