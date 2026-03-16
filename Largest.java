import java.util.Scanner;

class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int max = 0;

        while(num > 0) {
            int d = num % 10;
            if(d > max)
                max = d;
            num = num / 10;
        }

        System.out.println("Largest digit = " + max);
    }
}