/*Define a class ‘product’ with data members pcode, pname and price. Create three objects of the class and find the product having the lowest
price.*/
import java.util.Scanner;
class  product
{
	int pcode;
	String pname;
	float price;
	void get()
	{
		Scanner scan=new Scanner(System.in);
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the pcode:");
		pcode=scan.nextInt();
		System.out.println("enter the pname:");
		pname=scan1.nextLine();
		System.out.println("enter the price:");
		price=scan.nextFloat();
	}
	void display()
	{
		System.out.println("pcode:"+pcode);
		System.out.println("pname:"+pname);
		System.out.println("price:"+price);
	}
}
class productmain
{
	public static  void main(String arg[])
	{
		product p1=new product();
		product p2=new product();
		product p3=new product();
		p1.get();
		p2.get();
		p3.get();
		p1.display();
		p2.display();
		p3.display();
		System.out.print("product with lowest price:");	
		if (p1.price<=p2.price && p1.price<=p3.price)
			System.out.print(p1.pname);	
		else if(p2.price<=p1.price && p2.price<=p3.price)
			System.out.print(p2.pname);	
		else
			System.out.print(p3.pname);		
	}
}
