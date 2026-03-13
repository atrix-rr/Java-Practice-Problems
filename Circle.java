import java.util.*;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Radius");
        int r=sc.nextInt();

        double A=3.14*r*r;

        System.out.println("The Area is:"+A);

    }
}