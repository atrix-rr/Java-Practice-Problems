import java.util.*;
class CheckLeap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter ther year");
        int Year=sc.nextInt();

        if(Year%4==0)
        {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }
}