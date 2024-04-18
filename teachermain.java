/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class
‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification,
Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and contain constructors and methods to display the data members. Use array of objects to
display details of N teachers. 
*/
import java.util.Scanner;
class person
{
	String name;
	String gender;
	String address;
	int age;
	person(String a,String b,String c,int d)
	{
		name=a;
		gender=b;
		address=c;
		age=d;
	}
}
class employee extends person
{
	int empid;
	String companyname;
	String qualification;
	Double salary;
	employee(String a,String b,String c,int d,int e,String f,String g,Double h)
	{
		super(a,b,c,d);
		empid=e;
		companyname=f;
		qualification=g;
		salary=h;
	}
}
class teacher extends employee
{
	String subject;
	String department;
	int teacherid;
	Scanner scan=new Scanner(System.in);
	teacher(String a,String b,String c,int d,int e,String f,String g,Double h,String i,String j,int k)
	{
		super(a,b,c,d,e,f,g,h);
		subject=i;
		department=j;
		 teacherid=k;
	}
	void display()
	{
		System.out.println("TEACHER DETAILS\n------------------------------------");
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);
		System.out.println("address:"+address);
		System.out.println("age:"+age);
		System.out.println("empid:"+empid);
		System.out.println("companyname:"+companyname);
		System.out.println("qualification:"+qualification);
		System.out.println("salary:"+salary);
		System.out.println("subject:"+subject);
		System.out.println("department:"+department);
		System.out.println("teacherid:"+teacherid);
	}
}
class teachermain
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the number of teachers:");
		int n=scan.nextInt();
		teacher t[]=new teacher[100];
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the details of "+i+"th teacher");
			System.out.println("enter name:");
			String na=scan1.nextLine();
			System.out.println("enter gender:");
			String g=scan1.nextLine();
			System.out.println("enter address:");
			String a=scan1.nextLine();
			System.out.println("enter age:");
			int age=scan.nextInt();
			System.out.println("enter empid:");
			int e=scan.nextInt();
			System.out.println("enter companyname:");
			String c=scan1.nextLine();
			System.out.println("enter qualification:");
			String q=scan1.nextLine();
			System.out.println("enter salary:");
			Double s=scan.nextDouble();
			System.out.println("enter subject:");
			String su=scan1.nextLine();
			System.out.println("enter department:");
			String d=scan1.nextLine();
			System.out.println("enter teacherid:");
			int te=scan.nextInt();
			t[i]=new teacher(na,g,a,age,e,c,q,s,su,d,te);
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("Details of "+i+"th teacher\n------------------------------------------------");
			t[i].display();
		}
	}
}

