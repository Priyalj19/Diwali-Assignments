import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;        
            reversed = reversed * 10 + digit;  
            n = n / 10;                
        }
        
        if (original == reversed) {
            System.out.println("True  " + original + " is a palindrome.");
        } else {
            System.out.println("False  " + original + " is not a palindrome.");
        }
    }
}
