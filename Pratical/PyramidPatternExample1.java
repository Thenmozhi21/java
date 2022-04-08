class PyramidPatternExample1
{
public static void main(String args[])
{
int rows=5,j=0;
for(int i=1;i<=rows;i++,j=0)
{
for(int s=1;s<=rows-1;s++)
{
System.out.println(" ");
}
while(j!=2*i-1)
{
System.out.print("*");
j++;
}
System.out.println();
}
}
}