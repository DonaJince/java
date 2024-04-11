//Area of different shapes using overloaded functions.
class area
{
	int r1,r2;
	void area(int r)
	{
		System.out.println("area of circle:"+3.14*r*r);
	}
	void area(int l,int b)
	{
		System.out.println("area of rectangle:"+l*b);	
	}
	
}
class methodoverloading
{
	public static void main(String arg[])
	{
		area ob=new area();
		ob.area(2);
		ob.area(3,4);
	}
}

