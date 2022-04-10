class OddEven
{
public static void main(String[]args)
{
int Arr[]={2,4,6,8,3,9,11};

for(int i=0;i<Arr.length;i++)
if(Arr[i]%2==0){
System.out.println("Even numbers are:");
System.out.println(Arr[i]);}
else
{
System.out.println("Odd numbers are:");
System.out.println(Arr[i]);}
}
}