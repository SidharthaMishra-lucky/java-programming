import java.util.Scanner;

public class SumAndCountDigits 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find the sum of all digits
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // Count and print the digits present in both original and result numbers
        int result = sum;
        int count = 0;
        while (num != 0) 
         {
            int digit = num % 10;
            if (result % 10 == digit) 
            {
                count++;
                System.out.print(digit + " ");
            }
            num /= 10;
            result /= 10;
        }
        System.out.println("\nNumber of digits in common: " + count);
    }
}
