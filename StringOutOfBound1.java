class StringOutOfBound1
{
public static void main(String args[])
{
try
{
String n = "Vrushali";
char a = n.charAt(10);
System.out.println(a);
}
catch(Exception e)
{
System.out.println("Cannot access element present at index greater than String length");
}
}
}