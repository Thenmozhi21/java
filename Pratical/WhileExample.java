class WhileExample
{
public void show()
{
int i=50;
while(i>=1)
{
System.out.println("value is:"+i);
i=i-5;
}
}
public static void main(String []args)
{
WhileExample w=new WhileExample();
w.show();
}
}