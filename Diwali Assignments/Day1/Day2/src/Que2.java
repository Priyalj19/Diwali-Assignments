
import java.util.ArrayList;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (limit): ");
        int n = sc.nextInt();

        ArrayList<Integer> oddList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {        
                oddList.add(i);      
                sum += i;            
            }
        }

        System.out.println("Odd numbers: " + oddList);
        System.out.println("Sum of odd numbers = " + sum);
    }
}
