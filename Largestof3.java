import java.util.*;
class Largestof3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double L=Math.max(a,Math.max(b,c));

        if(a>b && a>c )
        {
            System.out.println("A is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is greater");
        }
        else
        {
            System.out.println("C is Greater");
        }

    }
}