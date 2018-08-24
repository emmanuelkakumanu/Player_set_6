import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();int len=0;
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			len++;
		}
		System.out.print(len);
	}
}
