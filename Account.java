import java.util.Scanner;
public class Account 
{
private int acct_no;
private String acct_type;
private String customer_name;
private double acct_balance;
public Account(int acct_no, String acct_type, String customer_name, double acct_balance) 
{
this.acct_no = acct_no;
this.acct_type = acct_type;
this.customer_name = customer_name;
this.acct_balance = acct_balance;
}
public double getAcctBalance() 
{
return acct_balance;
}
public String toString() 
{
return "Account Number: " + acct_no + "\nAccount Type: " + acct_type + "\nCustomer Name: " + customer_name + "\nAccount Balance: " + acct_balance;
}
public static void main(String[] args) 
{
int n = 5; 
Scanner input = new Scanner(System.in);
Account[] accounts = new Account[n];
for (int i = 0; i < n; i++) 
{
System.out.println("Enter Account Number, Account Type, Customer Name, and Account Balance for Customer " + (i+1) + ":");
int acct_no = input.nextInt();
String acct_type = input.next();
String customer_name = input.next();
double acct_balance = input.nextDouble();
accounts[i] = new Account(acct_no, acct_type, customer_name, acct_balance);
}
double max_balance = accounts[0].getAcctBalance();
int max_index = 0;
for (int i = 1; i < n; i++) 
{
if (accounts[i].getAcctBalance() > max_balance) 
{
max_balance = accounts[i].getAcctBalance();
max_index = i;
}
}
System.out.println("Customer with maximum balance in their account:");
System.out.println(accounts[max_index]);
}
}