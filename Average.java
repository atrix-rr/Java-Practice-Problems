import java.util.*;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 3-Numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        double Avg=(A+B+C)/3.0;

        System.out.println("The average is:"+Avg);
        
    }
}