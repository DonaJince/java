/*Write a program that reads from a file having integers. Copy even numbers and odd numbers to separate files.*/
import java.io.*;
class oddevenfile
{
	public static void copy(String f)
	{
	try{
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			FileWriter o=new FileWriter("odd.txt",true);
			FileWriter e=new FileWriter("even.txt",true);
			String i;
			while((i=br.readLine()) !=null)
			{
				if(Integer.parseInt(i) % 2==0)
				e.write(i+"\n");
				else
				o.write(i+"\n");
			}
			System.out.println("file copied successfully");    
			br.close();
			o.close();
			e.close();  
		}
		  catch(Exception e)
		      {
		      	System.out.println("error while copying  file");
		      }
	}
	public static void main(String arg[])
	{
		String filename="integers.txt";
		copy(filename);
	}
}
