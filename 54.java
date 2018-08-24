import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();int f=0;
		if(str1.length()!=str2.length())
		System.out.print("no");
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)==str2.charAt(i))
				f++;
			}
			//System.out.println(f);
			if(f==str1.length())
			System.out.print("yes");
			else
			System.out.print("no");
		}
	}
}
