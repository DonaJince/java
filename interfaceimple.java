/*Create an interface having prototypes of functions area() and perimeter(). Create two class Circle and Rectangle which implements the above
interface. Create a menu driven program to find area and perimeter of objects.*/
import java.util.Scanner;
interface i
{
	void get();
	void area();
	void perimeter();
}
class circle implements i
{
	int r;
	public void get()
	{
		System.out.println("enter the radius:");
		Scanner scan =new Scanner(System.in);
		r=scan.nextInt();
	}
	public void area()
	{
		System.out.println("area of circle:"+3.14*r*r);
	}
	public void perimeter()
	{
		System.out.println("perimeter of circle:"+2*3.14*r);
	}
}
class rectangle implements i
{
	int l,b;
	public void get()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the length:");
		l=scan.nextInt();
		System.out.println("enter the breadth:");
		b=scan.nextInt();
	}
	public void area()
	{
		System.out.println("area of rectangle:"+l*b);
	}
	public void perimeter()
	{
		System.out.println("perimeter of rectangle:"+2*(l+b));
	}	
}
class interfaceimple
{
	public static void main(String arg[])
	{
		circle c=new circle();
		rectangle r=new rectangle();
		int ch;
		Scanner scan =new Scanner(System.in);
		c.get();
		r.get();
		while(true)
		{
			System.out.println("menu\n1.area of circle\n2.area of rectangle\n3.perimeter of circle\n4.perimeter of rectangle\n5.exit\nenter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{
			        case 1:{
						c.area();
						break;
					     }
			        case 2:{
						r.area();
						break;
					     }
			        case 3:{
						c.perimeter();
						break;
					     }
			        case 4:{
						r.perimeter();
						break;
					     }
			        case 5:{
						return;
					     }
			}
		}
	}
}
