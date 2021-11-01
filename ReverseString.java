
public class ReverseString {
public static void main(String args[])
{
	/*System.out.println("hello world");*/
	String inputString="I  am  Tejas";
	//Tejas am I
	String[] arr=inputString.split(" ");
	/*for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}*/
	System.out.println(arr.length);
	String result="";
	for(String x:arr)
	{
		if(!x.isEmpty()) {
			System.out.println("hello");
	       result=x+" "+result;
		}
	}
	System.out.println(result);
}
}
