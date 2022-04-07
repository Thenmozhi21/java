class DoWhileExample
{
public void show()
{
int i=0;
do
{
System.out.println("value is:"+i);
i=i-5;
}
while(i>=1);
}
public static void main(String []args)
{
DoWhileExample d=new DoWhileExample();
d.show();
}
}