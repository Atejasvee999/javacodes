import java.io.*;
import java.util.*;
public class FileManupulation {
public static void main(String[] args)throws IOException {
	File file=new File("input.txt");
	int count=0;
	try 
	{
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			sc.nextLine();
			count++;
		}
		System.out.println("Number of lines = "+count);
		sc.close();
	}
	catch(Exception e){
		e.getStackTrace();
	}
	
}
}
