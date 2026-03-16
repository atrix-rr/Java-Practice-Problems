import java.util.*;
class Distance2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the distance in metres");
        int M=sc.nextInt();

        double KM=M/1000.0;

        System.out.println("The distance is:"+KM+" km ");
    }
}