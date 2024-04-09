//Program to Sort strings.
import java.util.Scanner;
class Strsort
{
	public static void main(String arg[])
	{
		int count,i,j;
		Scanner ob1=new Scanner(System.in);
		System.out.println("enter the count");
		count=ob1.nextInt();
		String s[]=new String[count];
		Scanner ob2=new Scanner(System.in);
		System.out.println("enter the strings");
		for(i=0;i<count;i++)
		{
			s[i]=ob2.nextLine();
		}
		String temp;
		for(i=0;i<count;i++)
		{
			for(j=i+1;j<count;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println("sorted strings :");
		for(i=0;i<count;i++)
		{
			System.out.println(s[i]);
		}
	}
}
