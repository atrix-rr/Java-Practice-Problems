import java.util.*;
class Percent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of 5 Subjects");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        double per=(a+b+c+d+e)/5.0;

        System.out.println("The Percentage is:"+per);
    }
}