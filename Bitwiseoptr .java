class Bitwiseoptr 
{
public static void main(String args[]) 
{
int num1 = Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
int num3 = num1 & num2;
System.out.println("num1 & num2 =" + num3);
num3 = num1 | num2;
System.out.println("num1 | num2 = " + num3);
num3 = num1 ^ num2;
System.out.println("num1 ^ num2 = " + num3);
num3 = ~num1;
System.out.println("~ num1 = " + num3);
    }
}
