import java.util.Scanner;
class cons_ex
{
int a;
String str;
cons_ex()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER STRING:");
	str=scan.nextLine();
	System.out.println("ENTER NUMBER:");
	a=scan.nextInt();
}
cons_ex(int x)
{
	a=x;
	Scanner scan=new Scanner(System.in);
	System.out.println("ENTER STRING:");
	str=scan.nextLine();
}
cons_ex(int x,String s)
{
	a=x;
	str=s;
}
void display()
{
	System.out.println("integer="+a);
	System.out.println("string="+str);
}
}
class constructor
{
	public static void main(String arg[])
	{
		 cons_ex c1=new cons_ex();
		 cons_ex c2=new cons_ex(2);
		 cons_ex c3=new cons_ex(12,"apple");
		 c1.display();
		 c2.display();
		 c3.display();
	}
}
