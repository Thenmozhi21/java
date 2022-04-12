class MultiArrayMulExample
{
public void show()
{
int Arr[][]={{1,2,3},{4,5,5},{7,6,8}};
int Arr1 [] []={ {1,2,3},{4,5,5},{7,6,8}};
int result [][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
for(int k=0;k<3;k++)
{

result[i][j]=result[i][j]+Arr[i][k]*Arr1[k][j];
}
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[])
{
MultiArrayMulExample e=new MultiArrayMulExample();
e.show();
}
}
