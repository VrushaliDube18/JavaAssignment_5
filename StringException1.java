public class StringException1
{
public static void main(String args[])
{
String n = null;
try
{
System.out.println(n.length());
}
catch(Exception e)
{
System.out.println("String is null can't display lenght");
}
}
}