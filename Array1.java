public class Array1{
public static void main(String args[])
{
int [] a={2,4,6,8};
try{
System.out.println("Number at index 4: "+a[4]);
}
catch(Exception e)
{
System.out.println("Cant get element at position 4 as array size is 4");
}
System.out.println("Number at index 2: "+a[2]);
}
}