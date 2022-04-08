class NumberPatternExample
{
public void ppattern(int num)
{
for(int i=1;i<num;i++)
{

for(int j=1;j<=i;j++){
System.out.print(j+"  ");
}
System.out.println();
}
}
public static void main(String args[])
{
NumberPatternExample p=new NumberPatternExample();
int num=10;
p.ppattern(num);
}
}