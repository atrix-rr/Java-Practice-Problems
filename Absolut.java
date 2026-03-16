import java.util.*;
class Absolut
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        double num=sc.nextDouble();

        double V=Math.abs(num);

        System.out.println("Thye value is:"+V);
    }
}