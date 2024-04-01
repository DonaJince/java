/*Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class
‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification,
Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and contain constructors and methods to display the data members. Use array of objects to
display details of N teachers. 

10.2 Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display
the Academic and Sports score of a student.*/
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
	float salary;
	employee(int a,String b,String c,float d)
	{
		empid=a;
		companyname=b;
		qualification=c;
		salary=d;
	}
}
class teacher extends employee
{
	String subject;
	String department;
	int teacherid;
	teacher(String a,String b,int c)
	{
		subject=a;
		department=b;
		 teacherid=c;
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
class teachermain()
{
	public static void main(String arg[])
	{
		Scanner scan=new Scanner;
		
	}
}

