import java.util.*;
class Divisibility
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int Num=sc.nextInt();

        if(Num%5==0 && Num%11==0)
        {
            System.out.println("It is Divisible");
        }
        else 
        {
            System.out.println("Not Divisible");
        }
    }
}