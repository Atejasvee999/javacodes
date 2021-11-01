
public class Fibbonaci {
//0,1,1,2,3,5,8
	public static void main(String[] args) {
		int second=1;
		int third=1;
		System.out.print(0+" ");
		System.out.println(second);
		System.out.println(third);
		while(third<10)
		{
			int temp=second+third;
			second=third;
			System.out.println(third);
			third=temp;
			
		}
	}
}
