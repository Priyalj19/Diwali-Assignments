import java.util.Scanner;

public class Que1 {
    static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Sum = " + addNumbers(a, b));
        sc.close();
    }
}
