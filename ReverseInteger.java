
public class ReverseInteger {
public static void main(String args[])
{
	//int INPUT_NUM=123;
	int inputNumber=123;
	int temp=0,result=0;
	while(inputNumber>0)
	{
		temp=inputNumber%10;
		result=result*10+temp;
		inputNumber=inputNumber/10;
	}
	System.out.println(result);
}
}
