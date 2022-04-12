class DuplicateElements
{
public static void main(String[]args)
{
int Arr[]={2,5,6,8,2,5,9,6};
System.out.println("Duplicate Elements is:");
for(int i=0;i<Arr.length;i++)
{
for(int j=i+1;j<Arr.length;j++)
{
if(Arr[i]==Arr[j])
System.out.println(Arr[j]);
}
}
}
}