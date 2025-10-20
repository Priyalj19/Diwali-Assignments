import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int reversed = reverseNumber(num);

        System.out.println("Reversed number: " + reversed);
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        int sign = 1;

        
        if (n < 0) {
            sign = -1;
            n = -n;  
        }

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit; 
            n = n / 10;
        }

   
        return rev * sign;
    }
}
