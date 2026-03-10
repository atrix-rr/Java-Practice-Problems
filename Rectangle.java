import java.util.*;
class Rectangle
{
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        double L=sc.nextDouble();

        System.out.println("Enter Breadth");
        double B=sc.nextDouble();

        double Area=L*B;

        System.out.println("The area is:"+Area);


        
    }
}