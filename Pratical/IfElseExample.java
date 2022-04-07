import java.util.*;
class IfElseExample
{
public void display()
{
System.out.println("enter your age:");
Scanner sc=new Scanner(System.in);
int age=sc.nextInt();
if(age>=18)
{
System.out.println("you are eligible");
}
else
{
System.out.println("you are not eligible");
}
}
public static void main(String[]args)
{
IfElseExample O=new IfElseExample();
O.display();
}
}