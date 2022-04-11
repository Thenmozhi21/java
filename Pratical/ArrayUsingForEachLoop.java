class ArrayUsingForEachLoop
{
public void display()
{
int digit[]={123,543,78,234,978,3453};
System.out.println(digit[0]);
System.out.println();
for(int n:digit)
{
System.out.println(n);
}
}
public static void main(String args[])
{
ArrayUsingForEachLoop e=new ArrayUsingForEachLoop ();
e.display();
}
}