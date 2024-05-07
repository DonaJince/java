/*Write a user defined exception class to authenticate the user name and password.*/
import java.util.Scanner;
class authexception extends Exception
 {
    public authexception(String message) 
    {
        super(message);
    }
}
class authentication
{
	String username="admin";
	String password="123";
	public void auth( String u,String p) throws authexception
	{
		int r=2/0;
		if(username.equals(u) && password.equals(p))
			throw new authexception("login succesfull!!!");
		else
			throw new authexception("login failed!!!");
	}
}
class authenticationmain
{
	public static void main(String a[])
	{
		authentication ob=new authentication();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter username:");
		String u=scan.nextLine();
		System.out.println("enter password:");
		String p=scan.nextLine();
		try
		{
			ob.auth(u,p);
		}
		catch (authexception e)
		{
			System.out.println(e);
		}
		finally 
		{
            	scan.close();
                    }
	}
}

