class Swapno
{
public static void main(String[] args) 
{
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
num1 = num1 ^ num2;
num2 = num1 ^ num2;
num1 = num1 ^ num2;
System.out.println("After swapping using XOR operator:");
System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
System.out.println("After restoring using + and - operators:");
System.out.println("num1 = " + num1);
System.out.println("num2 = " + num2);
    }
}
