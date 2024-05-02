/*Find the average of N positive integers, raising a user defined exception for each negative input.*/
import java.util.*;
class negexception extends Exception
{
	public negexception(String message)
	{
		super(message);	
	}
}
class averagemain 
{
	public static void main(String a[])
	{
		int num[]=new int[20];
		Scanner scan=new Scanner(System.in);
		Double avg=0.0;
		System.out.println("enter the limit:");
		int n=scan.nextInt();
		System.out.println("enter the numbers:");
		for(int i=1;i<=n;i++)
		{
			num[i]=scan.nextInt();
			try
			{
				if(num[i]<0)
				{
					i--;
					throw  new negexception("you have entered a negative number,plz enter positive numbers");
				}
				else
					avg=avg+num[i];
			}
			catch(negexception e)
			{
				System.out.println(e);
			}
			
		}
		System.out.println("Average:"+avg/n);
		
	}
	
}
