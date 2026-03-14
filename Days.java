import java.util.*;
class Days
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the days");
        int D=sc.nextInt();

        int Y=D/365;

        System.out.println("The Years are:"+Y);
    }
}