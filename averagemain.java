/*Find the average of N positive integers, raising a user defined exception for each negative input.*/
import java.util.*;
class negexception extends Exception
{
	public negexception(String message)
	{
		super(message);	
	}
}
class averege extends Exception
{
	int num[]=new int[20];
	Scanner scan=new Scanner(System.in);
	public void get() throws negexception
	{
		System.out.println("enter the limit:");
		int n=scan.nextInt();
		System.out.println("enter the numbers:");
		for(int i=1;i<=n;i++)
		{
			num[i]=scan.nextInt();
			if(num[i]<0)
			{
				throw negexception("you entered a negative number");
			}
		}
	}
}
class averagemain 
{
	public static void main(String a[])
	{
		
	}
	
}

