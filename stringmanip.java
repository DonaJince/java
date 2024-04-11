//Perform string manipulations
import java.util.Scanner;
class stringmanip
{
	public static void main(String arg[])
	{
		String s = "         Hello-World";
		System.out.println("Original string:"+s);
		System.out.println("character at index 0:"+s.charAt(0));
		System.out.println("substring from index 6:"+s.substring(6));
		System.out.println("string to uppercase:"+s.toUpperCase());
		System.out.println("string to lowercase:"+s.toLowerCase());
		System.out.println("trim white spaces:"+s.trim());
		System.out.println("replace world with Dona"+s.replace("World","Dona"));
		System.out.println("index of letter H:"+s.indexOf("H"));
		System.out.println("split the words:"+s.split("-"));
	}
}
