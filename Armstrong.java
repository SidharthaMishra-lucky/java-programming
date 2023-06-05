import java.util.Scanner;
public class Armstrong 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = input.nextInt();
int temp = num;
int sum = 0;
while (temp > 0) 
{
int rem = temp % 10; 
sum = sum+rem*rem*rem; 
temp =temp/10; 
}
if (num == sum) 
{
System.out.println("this is an Armstrong number."+num);
} 
else 
{
System.out.println("this is not an Armstrong number."+num);
}
}
}
