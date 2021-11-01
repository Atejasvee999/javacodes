import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class removeduplicate {
	public static void main (String args[]) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter number of elements in array");
	int l=Integer.parseInt(br.readLine());
	int[] arr = new int[l];
	System.out.println("enter elements of array in ascending or descending order");
	for (int i=0;i<l;i++)
	{
		arr[i]=Integer.parseInt(br.readLine());
	}
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int i=0;i<arr.length;i++)
{
	if (map.containsKey(arr[i]))
	{
		map.remove(arr[i]);
	}
	map.put(arr[i], i);
}
	map.forEach(k,v) -> System.out.print(k+"");
}
}
