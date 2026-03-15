import java.util.*;
class MiddleDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        int M=(num/10)%10;

        System.out.println("The Middle Digit is:"+M);
    }
}