import java.util.*;
class Product 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a 3 digit no.");
        int n=sc.nextInt();
        
        int d1=n/100;
        int d2=(n/10)%10;
        int d3=n%10;

        int P=d1*d2*d3;

        System.out.println("The product is:"+P);
    }
}