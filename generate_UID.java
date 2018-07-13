import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String Fname,Lname;
		int pin,n;
		Scanner s=new Scanner(System.in);
		Fname=s.next();
		Lname=s.next();
		pin=s.nextInt();
		n=s.nextInt();
		if(Fname.length()>Lname.length())
		{
			int len=Lname.length();
			String uid="";
			char d=Lname.charAt(len-1);
		            String pins=Integer.toString(pin);
			char f=pins.charAt(pins.length()-n);
			char f1=pins.charAt(n-1);
			uid=uid+Character.toString(d)+Fname+Character.toString(f1)+Character.toString(f);
	
                                     System.out.print(uid);
		}
	           else if(Fname.length()<Lname.length())
		{
			int len=Fname.length();
			String uid="";
			char d=Fname.charAt(len-1);
		            String pins=Integer.toString(pin);
			char f=pins.charAt(pins.length()-n);
			char f1=pins.charAt(n-1);
			uid=uid+Character.toString(d)+Lname+Character.toString(f1)+Character.toString(f);
	            }
	            for(i=0;i<uid.length();i++)
	            {
	            	uid
	            }
}
