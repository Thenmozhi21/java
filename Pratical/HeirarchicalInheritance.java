class Metal
{
String weight="100kg";
String color="black";
}
class Gold extends Metal
{
String color1="golden";
}
class Silver extends Metal
{
String color="silver";}
class HeirarchicalInheritance
{
public static void main(String []args)
{
Silver s=new Silver();
Gold g=new Gold();
System.out.println("silver has color:"+s.color);
System.out.println("Gold has color:"+g.color1);
System.out.println("metal weight:"+g.weight);
}
}