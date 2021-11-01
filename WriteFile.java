import java.io.*;
import java.util.*;
public class WriteFile {
public static void main(String[] args) {
	try
	{
		FileWriter obj=new FileWriter("input.txt");
		String inputText="Aditya is a bad boy";
		obj.write(inputText);
		System.out.println("Data is written");
		obj.close();
		 InputStream inputStream = new FileInputStream("input.txt");
	      Scanner sc = new Scanner(inputStream);
	      	      StringBuffer sb = new StringBuffer();
	    	      while(sc.hasNext()) {
	         sb.append(" "+sc.nextLine());
	    	      }
	    	      System.out.println(sb);
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
}
}
