class Bank
{
 int getRateOfInterest()
 {
	 return 9;
 }
}
class SBI extends Bank
 {
	 int getRateOfInterset()
	 {
	 return 8;
     }
 }
 class ICICI extends Bank
 {
	 int getRateOfInterset()
	 {
		 return 7;
	 }
 }
 class Axis extends Bank
 {
	 int getRateOfInterset()
	 {
		 return 6;
	 }
 }
 
 class MethodOverriding
 {
	 public static void main(String[]args)
	 {
		 SBI s=new SBI();
		 ICICI i=new ICICI();
		 Axis a=new Axis();
		 System.out.println("SBI Rate of interest:"+s.getRateOfInterset());
		 System.out.println("ICICI Rate of interest:"+i.getRateOfInterset());
		 System.out.println("Axis Rate of interest:"+a.getRateOfInterset());
	 }
 }
 