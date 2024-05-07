/*Write a program to write to a file, then read from the file and display the contents on the console. */
import java.io.*;
import java.util.Scanner;
class file
{
	public static void main(String arg[])
	{
		String filename="example.txt";
	      	try{
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			FileWriter fw=new FileWriter(f,true);
			String data;
			data=br.readLine();
			fw.write(data);
			System.out.println("content of file:");
			fw.close();
			br.close();
		}
		 catch(Exception e)
	     	 {
	     	 	System.out.println("error occured");
	     	 }
	}
}
