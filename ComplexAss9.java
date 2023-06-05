import java.util.Scanner;
class Complex 
{
public int real;
public int img;
{
public class complex()
{
real=1;
img=1;
}
public class complex(int a,int b)
{
real=a;
img=b;
}
public complex(complex A)
{
real=A.real;
img=A.img;
}
public void show()
{
System.out.println(real+ "+" +img+ "i");
}
public complex add(complex A)
{
complex as=new complex();
as.real=A.real+real;
as.img=A.img+img;
return as;
}
public complex sub(complex A)
{
complex as=new complex();
as.real=real-A.real;
as.img=img-A.img;
return as;
}
public complex mul(complex A)
{
complex as=new complex();
as.real=real*A.real;
as.img=img*A.img;
return as;
}
}
public class ComplexAss9
{
public static void main(String args[])
{
Scanner s=new scanner(System.in);
complex A=new complex();
System.out.println("Enter value for real");
int real=s.nextInt();
System.out.println("Enter value for img");
int img=s.nextInt();
complex x=new complex(11,12);
complex B=new complex(real,img);
B.show();
complex c=new complex(B);
c.show();
complex D=B.add(x);
D.show();
complex E=new complex();
e=B.sub(x);
E.show();
complex F=new complex();
F.B.mul(x);
F.show();
}
}