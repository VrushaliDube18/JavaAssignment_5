public class ExceptionHandling
{
public static void main(String args[])
{
int a=10,b=0,c=2;
int z,f,g,d;

z = a+b+c;

System.out.println("Addition : "+z);

d = a-b-c;
System.out.println("Subtraction : "+d);

try{
f= a/b;
System.out.println("Division : "+ f);
}
catch(Exception e){
System.out.println("Exception:Cannot divide by zero : "+e);
}

g= a*b*c;
System.out.println("Multiplication: "+ g);
}
}