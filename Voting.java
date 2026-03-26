import java.util.*;
class Voting 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Age");
        int Age=sc.nextInt();

        if(Age>=18)
        {
            System.out.println("Eligible for Voting");
        }
        else
        {
            System.out.println("Not Eligible for Voting");
        }
    }
}