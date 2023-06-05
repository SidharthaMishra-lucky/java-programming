class Areaofsphere 
{
public static void main(String[] args) 
{
double r= Double.parseDouble(args[0]);
double pi= 3.14159;
double area= 4*pi*r*r;
System.out.println("Area of sphere is:"+ area);
double volume=(4/3)*pi*r*r*r;
System.out.println("volume of sphere is:"+ volume);
}
}

