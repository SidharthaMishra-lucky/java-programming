import java.util.Scanner;
public class SumOfSeries3 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = input.nextInt();
double sum = 0.0;
double fact = 1.0;
for (int i = 1; i <= n; i++) 
{
fact =fact*i;
sum =sum + 1.0 / fact;
}
System.out.println("The sum of the series is "+sum);
}
}