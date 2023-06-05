import java.util.Scanner;
public class SumOfDigits 
{
public static void main(String args[]) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
int sumOfDigits = 0;
while (num > 0) 
{
int digit = num % 10; 
sumOfDigits += digit; 
num /= 10;
}
System.out.println("Sum of digits: " + sumOfDigits);
}
}
