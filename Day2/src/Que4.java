import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is NOT an Armstrong number.");
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int temp = n;
        int digits = 0;

    
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

       
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum += power;
            temp = temp / 10;
        }

        return sum == original;
    }
}
