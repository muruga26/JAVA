import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int a,b,c,i=0,j,count=0,t,temp;
		int d[]=new int[10];
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a<b&&a<c)
		{
			temp=a;
			
		}
		else if(a>b&&b<c)
		{
		temp=b;	
		}
		else{
		temp=c;
		}
		while(a!=0)
		{
			count++;
			d[i]=a%10;
			i++;
			a=a/10;
		}
		while(b!=0)
		{
			count++;
			d[i]=b%10;
			i++;
			b=b/10;
		}
		while(c!=0)
		{
			count++;
			d[i]=c%10;
			i++;
			c=c/10;
		}
		
		for(i=0;i<count;i++)
		{
			for(j=i;j<count;j++)
			{
				if(d[i]>d[j])
				{
					t=d[i];
					d[i]=d[j];
					d[j]=t;
				}
			}
		}
		
		System.out.println(d[count-1]+""+temp);
		
	}
}
