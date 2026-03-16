import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while(num > 0) {
            int d = num % 10;
            sum = sum + d*d*d;
            num = num / 10;
        }

        if(sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}