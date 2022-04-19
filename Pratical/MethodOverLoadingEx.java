class MethodOverLoadingEx
{
   static int pulseMe(int x,int y)
   {
   return x+y;
   }
   static int pulseMe(int x, int y, int z)
   {
   return x+y+z;
   }
   static double pulseMe(double x,double y)
   {
   return x+y;
   }
   
 public static void main(String[]args)
 {
   int a=pulseMe(67,87);
   int c=pulseMe(766,656,687);
   double d=pulseMe(67.87,786.87);
   System.out.println("int 2 argument:"+a);
   System.out.println("int 3 argument:"+c);
   System.out.println("double value:"+d);
 }
  
 }