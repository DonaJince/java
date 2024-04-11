//interface sample program
interface i
{
	int x=10;
	 void fun1();
	 void fun2();
}
class demo implements i
{
	int x=20;
	int data=12;
	public void fun1()
	{
		System.out.println("fun1 data:"+data);
		System.out.println(x);
	}
	public void fun2()
	{
		System.out.println("fun2 data:"+data);
	}
}
class interfacesample
{
	public static void main(String arg[])
	{
		demo ob=new demo();
		ob.fun1();
		ob.fun2();
	}
}
