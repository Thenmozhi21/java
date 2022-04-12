class Sample
{
int a;
String name;
double b=3.3;
Sample()
{
System.out.println("hi..im default constructor!");
}

public static void main(String[]args)
{
Sample s=new Sample();
System.out.println(s.a+" "+s.name+" "+s.b);
}
}


