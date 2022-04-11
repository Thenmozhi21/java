class MethodEx
{
//non static parameter method is used
public void evenOdd(int num)
{
if (num%2==0)
System.out.println("it is even"+num);
else
System.out.println("it is odd"+num);
}
//static parameter method is used
public static int add(int n1,int n2)
{
int result=n1+n2;
return result;
}
public static void main(String args[])
{
int n1=10;
int n2=20;
int result =add(n1,n2);
System.out.println("the addition is:"+result);
int num=2;
MethodEx m=new MethodEx();
m.evenOdd(num);
}
}