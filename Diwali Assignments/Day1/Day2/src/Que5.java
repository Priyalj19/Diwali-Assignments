import java.util.Scanner;

public class Que5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverse(num);

        System.out.println("Reversed number: " + reversed);
    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;   
            rev = rev * 10 + digit; 
            n = n / 10;           
        }

        return rev;
    }
}

