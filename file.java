/*Write a program to write to a file, then read from the file and display the contents on the console. */
import java.io.*;
import java.util.Scanner;
class file
{
	public static  void write(String f,String c)
	{
	try{
			FileWriter fw=new FileWriter(f,true);
			fw.write(c);
			fw.close();
	      }
	      catch(Exception e)
	      {
	      	System.out.println("error while writing into file");
	      }
	}
	public static  void read(String f)
	{
	try{
		FileReader fw=new FileReader(f);
		BufferedReader br=new BufferedReader(fw);
		String data;
		System.out.println("content of file:");
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		br.close();
		}
		 catch(Exception e)
	     	 {
	     	 	System.out.println("error while reading the file");
	     	 }
	}
	public static void main(String arg[])
	{
		String filename="example.txt";
		Scanner scan=new Scanner(System.in);
	          System.out.println("enter the content:(type exit to finish writing)");
		String content =scan.nextLine();
		while(!content.equals("exit"))
		{
		write(filename,content+"\n");
		content =scan.nextLine();
		}
		System.out.println("content is inserted");
		read(filename);
	}
}
