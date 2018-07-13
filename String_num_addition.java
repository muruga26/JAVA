import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		String a,b;
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.next();
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		c=c+d;
		a=Integer.toString(c);
		System.out.println(a);
	}
}
