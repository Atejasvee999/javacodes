import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binarysearch {
int binary_search(int arr[],int l,int r,int x)
{
	if (r>=1)
	{
		int mid =l+(r-l)/2;
		if(arr[mid]==x)
			return mid;
		if(arr[mid]>x)
			return binary_search(arr,l,mid-1,x);
		return binary_search(arr,l,mid+1,x);
	}
	return -1;

	}
public static void main (String args[]) throws IOException
{
	binarysearch m=new binarysearch();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter number of elements in array");
	int l=Integer.parseInt(br.readLine());
	int[] arr = new int[l];
	System.out.println("enter elements of array in ascending or descending order");
	for (int i=0;i<l;i++)
	{
		arr[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("enter element to be searched");
	int x=Integer.parseInt(br.readLine());
	int result=m.binary_search(arr, 0, l, x);
	if(result== -1)
		System.out.println("element not found");
	else
		System.out.println("element found at "+result);
}
}
