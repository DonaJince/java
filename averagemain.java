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
		public void get() throws negexception
		{
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
					throw  new negexception("you entered a negative number");
				else
					avg=avg+num[i];
				}
			}
			System.out.println("Average:"+avg/n);
		}
			average ob=new average();
			
				ob.get();

			catch(negexception e)
			{
				System.out.println(e);
			}
	}
	
}

