/*Create a class Employee having attributes eNo, eName eSalary. Read 'N' employ information and Search for an employee given eNo, using
the concept of Array of Objects*/
import java.util.Scanner;
class employee
{
	static int count=0;
	int eno;
	String ename;
	Double esalary;
	Scanner scan=new Scanner(System.in);
	employee()
	{
		count++;
	}
	void getinfo()
	{
		System.out.println("enter the details of employee:"+ count);
		System.out.println("enter the name:");
		ename=scan.nextLine();
		System.out.println("enter the eno:");
		eno=scan.nextInt();
		System.out.println("enter the salary:");
		esalary=scan.nextDouble();
	}
}
class employeemain
{
	public static void main(String arg[])
	{
		
		employee e[]=new employee[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of employees:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			e[i]=new employee();
			e[i].getinfo(); 
		}
		System.out.println("enter the employee's number to be searched:");
		int num=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(e[i].eno==num)
			{
				System.out.println("Employee 's name is :"+e[i].ename);
			}
		}
	}
}
