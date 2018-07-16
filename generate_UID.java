/* package whatever; // don't place package name! */

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
		int pin,n,i;
		String uid="";
		Scanner s=new Scanner(System.in);
		Fname=s.next();
		Lname=s.next();
		pin=s.nextInt();
		n=s.nextInt();
		if(Fname.length()>Lname.length())
		{
			int len=Lname.length();
			
			char d=Lname.charAt(len-1);
		            String pins=Integer.toString(pin);
			char f=pins.charAt(pins.length()-n);
			char f1=pins.charAt(n-1);
			uid=uid+Character.toString(d)+Fname+Character.toString(f1)+Character.toString(f);
	
                                     
		}
		else if(Fname.length()==Lname.length())
		{
			if(Fname.compareTo(Lname)>0)
			{
			String temp;
			temp=Fname;
			Fname=Lname;
			Lname=temp;
			}
			int len=Lname.length();
			
			char d=Lname.charAt(len-1);
		            String pins=Integer.toString(pin);
			char f=pins.charAt(pins.length()-n);
			char f1=pins.charAt(n-1);
			uid=uid+Character.toString(d)+Fname+Character.toString(f1)+Character.toString(f);
			 
                              
		}
		else
		{
			int len=Fname.length();
			
			char d=Fname.charAt(len-1);
		            String pins=Integer.toString(pin);
			char f=pins.charAt(pins.length()-n);
			char f1=pins.charAt(n-1);
			uid=uid+Character.toString(d)+Lname+Character.toString(f1)+Character.toString(f);
		
			
		}
		String uid1=" ";
		for(i=0;i<uid.length();i++)
		{
			if(Character.isLowerCase(uid.charAt(i)))
			{
				uid1=uid1+Character.toUpperCase(uid.charAt(i));
			}
			else
			{
			uid1=uid1+Character.toLowerCase(uid.charAt(i));	
			}
		}
		System.out.println(uid1);
	}
}
