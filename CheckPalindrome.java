
public class CheckPalindrome {
public static void main(String[] args) {
	String inputString="pacecar";
	System.out.println(checkPalindrome(inputString));
}
public static boolean checkPalindrome(String str) {
	if(str==null||str.isEmpty())
		return false;
	int left=0,right=str.length()-1;
	str=str.toLowerCase();
	while(left<right)
	{
		if(str.charAt(left)==str.charAt(right))
		{
			left++;
			right--;
		}
		else
		{
			return false;
		}
	}
	return true;
	
}
}
