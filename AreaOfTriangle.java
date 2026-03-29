import java.util.*;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        {
            System.out.println("Enter Base and Height");
            double B=sc.nextDouble();
            double H=sc.nextDouble();

            double A=0.5*B*H;

            System.out.println("The Area is:"+A);
        }
    }
}