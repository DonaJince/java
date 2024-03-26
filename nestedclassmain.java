class outer
{
	private int out1=34;
	int out =20;
	class inner
	{
		int in=30;
		void innerdisplay()
		{
			System.out.println("innerdisplay:"+in);
			System.out.println("innerdisplayprivate:"+out1);                                    //outer class private member access in inner class
		}
		void class_within_method()
		{
			class methodinner                                                                                                           //class within a method
			{
				int mi=40;
				void display()
				{
					System.out.println("display:"+mi);    
				}
			}
			methodinner m=new methodinner();
			m.display();
		}
	}
	void outerdisplay()
	{
		System.out.println("outerdisplay:"+out);
		System.out.println("outerdisplayprivate:"+out1);
	}
}
class nestedclassmain
{
	public static void main(String arg[])
	{
		outer o=new outer();
		o.outerdisplay();
		outer.inner i=o.new inner();                             //inner class object creation
		i.innerdisplay();
		i.class_within_method();
	}
}
