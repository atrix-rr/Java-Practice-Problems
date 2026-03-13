import java.util.*;
class Distance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the distanc(In km)");
        double km=sc.nextDouble();

        double M=km*1000;

        System.out.println("The Distance in metres is:"+M);
    }
}