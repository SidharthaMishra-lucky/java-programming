import java.util.*;
public class IntArray 
{
private int[] arr;
private int size;
public IntArray(int size) 
{
this.size = size;
arr = new int[size];
for (int i = 0; i < size; i++)
{
arr[i] = 0;
}
}
public void inputElements() 
{
Scanner sc = new Scanner(System.in);
for (int i = 0; i < size; i++) 
{
System.out.print("Enter element at index " + i + ": ");
arr[i] = sc.nextInt();
}
}
public void displayElements() 
{
System.out.print("Array elements: ");
for (int i = 0; i < size; i++) 
{
System.out.print(arr[i] + " ");
}
System.out.println();
}
public int getSum() 
{
int sum = 0;
for (int i = 0; i < size; i++) 
{
sum += arr[i];
}
return sum;
}
public double getAverage()
{
return (double) getSum() / size;
}
public void swapMinMax() 
{
int minIndex = 0;
int maxIndex = 0;
for (int i = 1; i < size; i++) 
{
if (arr[i] < arr[minIndex]) 
{
minIndex = i;
}
if (arr[i] > arr[maxIndex]) 
{
maxIndex = i;
}
}
int temp = arr[minIndex];
arr[minIndex] = arr[maxIndex];
arr[maxIndex] = temp;
}
public void UniqueElements() 
{
System.out.println("Unique elements:");
int n = arr.length;
Arrays.sort(arr);
int count = 1;
for (int i = 1; i < n; i++) 
{
if (arr[i] == arr[i - 1]) 
{
count++;
} 
else 
{
System.out.println(arr[i - 1] + " occurs " + count + " time(s)");
count = 1;
}
}
System.out.println(arr[n - 1] + " occurs " + count + " time(s)");
}
}
public class ArrayInt
{
public static void main(String[] args) 
{
IntArray array = new IntArray(5);
array.inputElements();
array.displayElements();
System.out.println("Sum of elements: " + array.getSum());
System.out.println("Average of elements: " + array.getAverage());
array.swapMinMax();
array.displayElements();
array.UniqueElements();
}
}