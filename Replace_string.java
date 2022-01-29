package string.workings;

public class Replace_string {
	public static void main(String[] args)
	{
		Replace_string r=new Replace_string();
		String s="hai how are you";
		r.replacestring(s);
	}

	private void replacestring(String s) 
	{
	    s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
			{
				s=s.replace(s.charAt(i), '$');
			}
		}
		System.out.println(s);
	}

}
