import java.util.*;
class OddDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number");
        int num=sc.nextInt();

        int H=num/100;
        int T=(num/10)%10;
        int O=num%10;

        int sum=0;

        if(H%2!=0)sum+=H;
        if(T%2!=0)sum+=T;
        if(O%2!=0)sum+=O;

        System.out.println("The Sum is:"+sum);
    }
}