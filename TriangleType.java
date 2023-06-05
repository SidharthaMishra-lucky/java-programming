import java.util.Scanner;
class TriangleType 
{
public static void main(String args[]) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the length of side 1: ");
double side1 = input.nextDouble();
System.out.print("Enter the length of side 2: ");
double side2 = input.nextDouble();
System.out.print("Enter the length of side 3: ");
double side3 = input.nextDouble();
if (side1 == side2 && side2 == side3) 
{
System.out.println("Equilateral triangle");
}
else if (side1 == side2 || side1 == side3 || side2 == side3) 
{
System.out.println("Isosceles triangle");
} 
else
{
System.out.println("Scalene triangle");
}
}
}
