/*Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle. Test the package by finding the
area of these figures.*/
import graphics.rectangle;
import graphics.triangle;
import graphics.circlee;
import graphics.squaree;
class graphicsmain
{
	public static void main(String arg[])
	{
		rectangle r=new rectangle();
		triangle t=new triangle();
		squaree s=new squaree();
		circlee c=new circlee();
		int r1=r.rect_area(2,3);
		Double r2=t.tri_area(2,2);
		int r3=s.squ_area(4);
		Double r4=c.cir_area(2);
		System.out.println("area of rectangle="+r1);
		System.out.println("area of triangle="+r2);
		System.out.println("area of square="+r3);
		System.out.println("area of circle="+r4);
	}
}
