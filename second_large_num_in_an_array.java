import java.util.*;
public class HelloWorld{
   	 static void largenum(int n,int a[])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a[0]==a[n-1])
		{
		    System.out.print("-1");
		}
		else
		{
		    System.out.print(a[1]);
		}
	}
     public static void main(String []args)
     {
    
	
		int n,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		largenum(n,a);
	}
     
}
