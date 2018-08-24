import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String l=s.nextLine();
		//l=l.trim();
		String w=s.next();int c=0;
		String words[]=l.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(w))
			{
				c++;
			}
		}
		System.out.print(c);
	}
}
