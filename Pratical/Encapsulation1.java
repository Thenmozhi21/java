import java.util.*;
class Encap
{
private String name;
private int user_id;
private int password;
int percent,total;

//get method
public String get_name()
{
return name;
}
public int get_user_id()
{
return user_id;
}
public int get_password()
{
return password;
}

//set method
public void set_name(String value)
{
name=value;
}
public void set_user_id(int value)
{
user_id=value;
}
public void set_password(int value)
{
password=value;
}
// method calculation
public void calculation(int mark1,int mark2,int mark3,int mark4,int mark5)
{
total=mark1+mark2+mark3+mark4+mark5;
percent=total/5;

          if(percent>=50&&percent<60)
         {
           System.out.println("D grade");
           }
           else if(percent>=60&&percent<70)
         {
           System.out.println("C grade");
          }
          else if(percent>=70&&percent<80)
         {
           System.out.println("B grade");
           }
            else if(percent>=80&&percent<90)
         {
           System.out.println("A grade");
          }
             else if(percent>=90&&percent<100)
         {
           System.out.println("O grade");
          }
            else
            {
            System.out.println("fail or absent");
            }
}
}
public class Encapsulation1
{
 public static void main(String args[])
   {
       Scanner sc =new Scanner(System.in);
	   
         String name;
         int u_id,password;
         int mark1,mark2,mark3,mark4,mark5;
         System.out.println("Enter your name:");
         name=sc.nextLine();
         System.out.println("Enter your id:");
         u_id=sc.nextInt();
         System.out.println("Enter your password:");
         password=sc.nextInt();
          System.out.println("Enter your mark1:");
          mark1=sc.nextInt();    
          System.out.println("Enter your mark2:");
          mark2=sc.nextInt();    
          System.out.println("Enter your mark3:");
          mark3=sc.nextInt();    
         System.out.println("Enter your mark4:");
          mark4=sc.nextInt();    
         System.out.println("Enter your mark5:");
          mark5=sc.nextInt();    
         
         
          

      Encap o=new Encap();
      o.set_name(name);
      o.set_user_id(u_id);
      o.set_password(password);
      
	  
       System.out.println("Name:"+o.get_name());
       System.out.println("User_id:"+o.get_user_id());
       System.out.println("Password:"+o.get_password());
       o.calculation(mark1,mark2,mark3,mark4,mark5);
	   System.out.println("percentage:"+o.percent);
	   System.out.println("Total:"+o.total);
   }
}


