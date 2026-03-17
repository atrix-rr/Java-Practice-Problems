import java.util.Scanner;

class FirstLastSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int first = num / 100;
        int last = num % 10;

        int sum = first + last;

        System.out.println("Sum = " + sum);
    }
}