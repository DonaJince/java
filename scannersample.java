import java.util.Scanner;
class scannersample
{
	public static void main(String arg[])
	{
			try
			{
				Scanner s=new Scanner(System.in);
				System.out.println("enter your name:");
				String str=s.nextLine();

				System.out.println("enter your age:");
				int a=s.nextInt();

				System.out.println("enter your mark:");
				float f=s.nextFloat();

				System.out.println("enter your percentage:");
				double d=s.nextDouble();
				System.out.println("name:"+str);
				System.out.println("age:"+a);
				System.out.println("mark:"+f);
				System.out.println("percentage:"+d);
			}
			catch (Exception e)
			{
					System.out.println("ERROR OCCURED");
			}
	}
}
