import java.util.*;
class Demo1
{
 abstract show();
 public void display()
 {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int size=s.nextInt();
	 System.out.println("Enter"+size+ "numbers");
	 int Arr[]=new int[size];
	 for(int i=0;i<size;i++)
	 {
		 Arr[i]= s.nextInt();
	 }
	  for(int i=0;i<size;i++)
	  {
		  
		 System.out.println(Arr[i]);
	  }
	  
		 
	 }
}

	 