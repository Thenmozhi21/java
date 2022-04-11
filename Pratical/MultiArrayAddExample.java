class MultiArrayAddExample
{
public void show()
{
int Arr[][]={{1,2,3},{4,5,6},{7,8,9}};
int Arr1 [] []={ {1,2,3},{4,5,6},{7,8,9}};
int result [][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
result[i][j]=Arr[i][j]+Arr1[i][j];
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
MultiArrayAddExample e=new MultiArrayAddExample();
e.show();
}
}