import java.util.*;
class TwoDArray {
int[][] arr;
int m; int n;
public TwoDArray(int n) 
{
this.m2; 
this.arr = new int[2][n];
this.n= n;
}
public TwoDArray (TwoDArray other) 
{ 
this.arr other.arr;
this.m other.m;
this.other.n;
}
public void input(} {

Scanner sc new Scanner(System.in);
System.out.println("Enter the elements: "); 
for (int i = 0; i < m; i++)
for (int j=0; j < n; j++) 
arr[i][j] sc.nextInt();
}

public void display() {

System.out.print("Array elements: ");

for (int i = 0; i < m; i++)
 for (int j=0; j < n; j++) 
System.out.println(arr[i][j]+" "); 
System.out.println();
}
public void splitarray (OneDArray arr1, OneDArray arr2){

for (int i = 0; i < m-1; i++) 
for (int j=0; j < n; j++)
arr1.arr[1]-arr[i][j];

for (int i = 1; i <m; i++)
for (int j=0; j < n; j++) 
arr2.arr[1]-arr[i][j];
}
public void Add2dArray (TwoDArray arr2d){
for(int i=0;i<m;i++)
 for(int j=0;j<n;j++)
int carr[i][j]+arr2d.arr[i][j]; 
System.out.print(c+" ");
}
System.out.println();
}
}
public void matrixmultp (TwoDArray arr2d)
{
if (arr2d.m != n) 
{
System.out.println( "\nMultiplication Not Possible");
return;
}
System.out.println("Result of matrix multiplication is"); 
int c-0;
for (int i = 0; i < m; i++){  
for (int j=0; j<arr2d.n; j++){ 
for (int k = 0; k < arr2d.m; k++)

arr[i][k] arr2d.arr[k][j];
}
System.out.print(c+" ");
c=0; 
System.out.println();
}
}

class OneDArray{
int[] arr; int size;
public OneDArray(int size) { 
this.size = size; 
this.arr = new int[size];
}
public void input() {
Scanner sc- new Scanner(System.in); 
System.out.println("Enter "+size+" elements:"); 
for (int i=0; i < size; i++) {
arr[1] sc.nextInt();
}
}
public void display() {
System.out.print("Array elements: ");
C+=System.out.print(c+" ");
c=0; 
} 
System.out.println();
}

class OneDArray{

int[] arr; int size;

public OneDArray(int size) { this.size-size; this.arr new int[size];

public void input() {

Scanner sc = new Scanner(System.in); System.out.println("Enter" + size + " elements: ");

for (int i = 0; i < size; i++) { arr[i] sc.nextInt();

}

}

public void display() {

System.out.print("Array elements: "); for (int i = 0; i < size; i++) { System.out.print(arr[i] + " ");

} System.out.println();

public class ArrayMain{

public static void main(String[] args) {

System.out.println("Enter the Number of Columns") Scanner sc = new Scanner(System.in);

int n-sc.nextInt();

TwoDArray arr new TwoDArray(n); OneDArray arr1- new OneDArray(n);

OneDArray arr2= new OneDArray(n); arr.input();

arr.display(); arr.splitarray(arr1, arr2); arr2.display(); TwoDArray arr2d = new TwoDArray(arr);

arri.display();

arr2d.display(); arr.Add2dArray(arr2d);

arr.matrixmultp(arr2d);

Type here to search

b