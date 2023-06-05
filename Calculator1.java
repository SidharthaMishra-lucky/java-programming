import java.util.*;

public class Calculator1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator(+,-,*,/,%)");
        char c=sc.next().charAt(0);
        int ss=0;
        switch(c)
        {
            case '+' :
            ss=a+b; 
            System.out.println("Addition of number is "+ss);
            break;
            case '-' :
            ss=a-b; 
            System.out.println("Subtrction of number is "+ss);
            break;
            case '*' :
            ss=a*b; 
            System.out.println("Multiplication of number is "+ss);
            break;
            case '/' :
            ss=a/b; 
            System.out.println("Division of number is "+ss);
            break;
            case '%' :
            ss=a%b; 
            System.out.println("MOdulos of number is "+ss);
            break;
        }
    }
}
