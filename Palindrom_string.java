package string.workings;

public class Palindrom_string {
	public static void main(String[] args)
	{
		Palindrom_string str=new Palindrom_string();
		str.palindrome();		
	}

	private void palindrome()
	{
		String str=" mom ";
		str=str.trim();
		String s="";
		for(int i=str.length();i>0;i--)
		{
			s=s+str.charAt(i-1);
		}
		if(str.equals(s))
			System.out.println(" palindrome ");
		else
			System.out.println(" not a palindrome ");
	}

}
