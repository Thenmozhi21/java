import java.util.*;
class GradeExample
{
public void show()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter marks:");
int marks=sc.nextInt();
if(marks>=40&&marks<50)
System.out.println("d Grade");
else if(marks>=50&&marks<65)
System.out.println("c Grade");
else if(marks>=65&&marks<75)
System.out.println("b Grade");
else if(marks>=75&&marks<85)
System.out.println(" a Grade");
else if(marks>=85&&marks<100)
System.out.println("o  Grade");
else
System.out.println("fail or absent");
}
public static void main(String[]args)
{
GradeExample o=new GradeExample();
o.show();
}
}
