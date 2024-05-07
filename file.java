/*Write a program to write to a file, then read from the file and display the contents on the console. */
import java.io.*;
import java.util.Scanner;
class file
{
	public static void main(String arg[])
	{
		String f="example.txt";
	      	try
			    {
			      		System.out.println("enter the content:");
						InputStreamReader in=new InputStreamReader(System.in);
						BufferedReader br=new BufferedReader(in);
						FileWriter fw=new FileWriter(f);
						String data;
						data=br.readLine();
						fw.write(data);
						System.out.println("Content written to file successfully.");
						fw.close();
						br.close();
						System.out.println("content of file:");
						FileReader fr=new FileReader(f);
						BufferedReader b=new BufferedReader(fr);
						while((data=b.readLine()) !=null)
						{
							System.out.println(data);
						}
						fr.close();
						b.close();
				}
		 catch(Exception e)
	     	 {
	     	 	System.out.println("error occured"+e.getMessage());
	     	 }
	}
}
