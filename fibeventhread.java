/*Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range. Implement using threads. (Runnable Interface).*/
class fibonaaci implements Runnable
{
	int limit,a=0,b=1,c;
	fibonaaci(int num)
	{
		limit=num;
	}
	public void run()
	{
		for(int i=0;i<limit;i++)
		{
			System.out.println("fibonaaci number:"+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
class even implements Runnable
{
	int limit;
	even(int num)
	{
		limit=num;
	}
	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number:"+i);
			}
		}
	}
}
class fibeventhread
{
	public static void main(String[] args)
    {
		fibonaaci f=new fibonaaci(10);
		even e=new even(10);
		Thread t1=new Thread(f,"fibonaaci");
		Thread t2=new Thread(e,"even");
		System.out.println("first 10 fibonaaci numbers :");
		t1.start();
		System.out.println("even numbers up to 10:");
		t2.start();
		System.out.println("name of thread t1 :"+t1.getName());
		System.out.println("name of thread t2 :"+t2.getName());
	}
}

