/*Program to create static and non static methods.*/
import java.util.*;
class sample
{
	static void fun1()
	{
		System.out.println("I am in static function 1");
	}
	void fun2()
	{
		System.out.println("I am in function 2");
	}
	public static void main(String a[])
	{
	sample s =new sample();
	int m,n;
		System.out.println("I am in main");
		fun1();
		s.fun2();
		System.out.println("command argument 1:"+a[0]);
		m=Integer.parseInt(a[1]);
		n=Integer.parseInt(a[2]);
		System.out.println("sum:"+(m+n));
	}
}
