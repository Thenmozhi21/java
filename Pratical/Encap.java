import java.util.*;
class Encap_demo
{
private String password;
private int user_id;
private int otp;


//get method
public String get_pass()
{
return password;
}
public int get_user_id()
{
return user_id;
}
public int get_otp()
{
return otp;
}

//set method
public void set_pass(String value)
{
password=value;
}
public void set_user_id(int value)
{
user_id=value;
}
public void set_otp(int value)
{
otp=value;
}
}
public class Encap
{
 public static void main(String args[])
   {
       Scanner sc =new Scanner(System.in);
	   
         String name,password;
         int u_id,otp;
         
         
		 System.out.println("Enter your name:");
         name=sc.nextLine();
         System.out.println("Enter your id:");
         u_id=sc.nextInt();
         System.out.println("Enter your password:");
         password=sc.nextLine();
		 System.out.println("Enter your otp:");
         otp=sc.nextInt();
		 
		 
		 
      Encap_demo o=new Encap_demo();
	  
      o.set_user_id(u_id);
      o.set_pass(password);
      o.set_otp(otp);
	  
       System.out.println("Name:"+name);
       System.out.println("User_id:"+o.get_user_id());
       System.out.println("Password:"+o.get_pass());
      System.out.println("otp:"+o.get_otp());
	   
   }
}
