import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();int f=0;
		String str2=s.next();
		if(str1.length()==str2.length())
		{
		for(int i=0;i<str1.length() && i<str2.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
				f=1;break;
			}
		}
		if(f==1)
		System.out.print("yes");
		else
		System.out.print("no");
		}
		else
		System.out.print("Invalid");
	}
}
