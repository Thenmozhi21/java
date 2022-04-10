import java.util.*;
class FibonacciSeries
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter first number:");
int n1=sc.nextInt();
System.out.println("enter second number:");
int n2=sc.nextInt();
System.out.println("enter number of times:");
int count=sc.nextInt();
int n3;
for(int i=2;i<count;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}