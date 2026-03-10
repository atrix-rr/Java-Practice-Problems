import java.util.*;
class Cost 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 Side");

        double Side=sc.nextDouble();

        double Perimeter=4*Side;

        System.out.println("Enter the cost for 1 meter");
        int C=sc.nextInt();

        int cost=(int) (Perimeter*C);

        System.out.println("The total cost is:"+cost);
    }
}