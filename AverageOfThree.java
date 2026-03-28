import java.util.*;
class AverageOfThree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Three Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double A=(a+b+c)/3;

        System.out.println("The Result is:"+A);
    }
}