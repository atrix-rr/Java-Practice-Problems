import java.util.Scanner;

class CountOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = num / 100;

        int count = 0;

        if(d1 % 2 != 0) count++;
        if(d2 % 2 != 0) count++;
        if(d3 % 2 != 0) count++;

        System.out.println("Odd digits = " + count);
    }
}