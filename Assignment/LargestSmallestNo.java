class LargestSmallestNo
{
public void display()
{
int No[]={12,34,56,78,99,2};
int largest=No[0];
int smallest=No[0];
for(int i=1;i<No.length;i++)
{
if(No[i]>largest)
largest=No[i];
else if (No[i]<smallest)
smallest=No[i];
}
System.out.println("smallest element is:"+smallest);
System.out.println("largest element is:"+largest);
}
public static void main(String[]args)
{
 LargestSmallestNo e=new LargestSmallestNo();
e.display();
}
}

