class Temp 
{
public static void main(String[] args) 
{
double fahrenheit = Double.parseDouble(args[0]);
double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
System.out.printf("temp in celsius"+ celsius);
}
}

