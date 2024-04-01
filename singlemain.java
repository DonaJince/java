class base
{
	int x=10;
	void show()
	{
		System.out.println("value of  base x="+x);
	}
}
class child extends base
{
	int x=20;
	void show()
	{
		super.show();
		System.out.println("value of  child x="+x);
	}
}
class singlemain
{
	public static void main(String arg[])
	{
		child c=new child();
		c.show();
	}
}
