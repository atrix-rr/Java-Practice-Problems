import java.util.*;
class Birthday
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Birth Year");
        int Y=sc.nextInt();

        int A=2026-Y;

        System.out.println("Your Age is:"+A);
    }
}