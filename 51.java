import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		if(n<=0)
		System.out.print("Invalid");
		else if(n==1)
		System.out.print(a[0]);
		else 
		{
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];	
						a[j]=temp;
					}
				}
			}
			System.out.print(a[1]);
		}
	}
}
