
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
		int n,score,i,j;
		
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		String a[]=new String[n];
		int t[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.next();
		}
		score=s.nextInt();
		String sc=Integer.toString(score);
		
		for(i=0;i<n;i++)
		{
			t[i]=0;
			for(j=0;j<sc.length();j++){
			t[i]=t[i]+(int)sc.charAt(j)-48;
			j=j+n-1;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(t[i]<t[j])
				{
					int t1;
					String t3;
					t1=t[i];
					t3=a[i];
					t[i]=t[j];
					a[i]=a[j];
					t[j]=t1;
					a[j]=t3;
				}
			}
		}
		System.out.print(a[0]+""+t[0]);
}
}
