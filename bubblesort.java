import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubblesort {
void bubble_sort(int arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j+1]<arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}

}
void printarray(int arr[])
{
	for (int i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
public static void main (String args[])throws  IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in))	;
System.out.println("enter number of elements");
int n=Integer.parseInt(br.readLine());
int[]arr=new int[n];
System.out.println("enter elements of array");
for (int i=0;i<n;i++)
{
	arr[i]=Integer.parseInt(br.readLine());
}
bubblesort b=new bubblesort();
b.bubble_sort(arr);
b.printarray(arr);
}
}
