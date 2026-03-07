import java.util.*;
class StudentData
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        //Now we will take input about the data of the Student
        
        System.out.println("Enter your Name");
        String N=sc.nextLine();

        System.out.println("Enter your Roll No.");
        int Roll=sc.nextInt();

        System.out.println("Enter Marks of 5 different Subjects");
        int Bio=sc.nextInt();
        int Chem=sc.nextInt();
        int Maths=sc.nextInt();
        int Phy=sc.nextInt();
        int Eng=sc.nextInt();
        
        int M=Bio+Chem+Maths+Phy+Eng;

        //Here the Academic ladder starts

        if(M>490 && M>500)
        {
            System.out.println("A+ Grade");
        }
    }
}