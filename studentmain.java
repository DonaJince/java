/*10.2 Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display
the Academic and Sports score of a student.*/
import java.util.*;
class student
{
	int roll;
	String name;
	Double mark;
	Scanner scan=new Scanner(System.in);
	void getstudent()
	{
		System.out.println("enter student details");
		System.out.println("enter student name:");
		name=scan.nextLine();
		System.out.println("enter student rollno:");
		roll=scan.nextInt();
		System.out.println("enter student mark:");
		mark=scan.nextDouble();	
	}
}
class sports extends student
{
	Double sportspoints;
	Scanner scan=new Scanner(System.in);
	void getsports()
	{
		System.out.println("enter student sports point:");
		sportspoints=scan.nextDouble();
	}
}
class result extends sports
{
	void display()
	{
		System.out.println("STUDENT DETAILS\n------------------------");
		System.out.println("name:"+name);
		System.out.println("rollno:"+roll);
		System.out.println("marks:"+mark);
		System.out.println("sports points:"+sportspoints);
	}
}
class studentmain
{
	public static void main(String arg[])
	{
		result r=new result();
		r.getstudent();
		r.getsports();
		r.display();
	}
}

