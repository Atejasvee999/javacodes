import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string {
public static void main (String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter sentence");
	String[] s=br.readLine().split(" ");
	System.out.println(s[0]);
}
}
