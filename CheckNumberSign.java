import java.util.Scanner; 
class CheckNumberSign 
{
    public static void main(String[] args) 
    {
        int number;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        number = s.nextInt(); 

        if (number > 0) {
            System.out.println("The given number " + number + " is Positive");
        } else if (number < 0) {
            System.out.println("The given number " + number + " is Negative");
        } else {
            System.out.println("The given number " + number + " is Zero");
        }

    
    }
}
