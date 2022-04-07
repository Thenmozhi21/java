import java.util.Scanner;
class IfElseIfExample
{
public void show()
{
Scanner s=new Scanner(System.in);
System.out.println("enter time:");
int time=s.nextInt();
if(time<12)
{
System.out.println("hi.....good mrng");
}
else if(time<17)
{
System.out.println("hi.....good afternoon");
}
else if(time<20)
{
System.out.println("hi.....good evening");
}
else
{
System.out.println("bye.....good night");
}}
public static void main(String[]args)
{
IfElseIfExample e=new IfElseIfExample();
e.show();
}
}