import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Height");
        int H=sc.nextInt();

        System.out.println("Enter Base");
        int B=sc.nextInt();

        double A=0.5*B*H;

        System.out.println("The Area is:"+A);
    }
      
    
}