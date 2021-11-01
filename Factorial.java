
public class Factorial {
	public static int factorial(int input)
	{
		int result=1;
		if (input<1)
		{
			return result;
		}
		result=input*factorial(input-1);
		return result;
	}
public static void main(String[] args) {
	int input=5;
    int result=factorial(input);
    System.out.println("Factorial is "+result);
}
}
