import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate {
public static void main (String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter string");
			String[]str=br.readLine().split(" ");
			Set<String> abc=new LinkedHashSet<String>();
			for(String x:str)
			{
				abc.add(x);
			}
			Iterator<String> itr=abc.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
}
}
