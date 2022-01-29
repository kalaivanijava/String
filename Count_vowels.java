package string.workings;

public class Count_vowels {
	public static void main(String[] args)
	{
		Count_vowels c=new Count_vowels();
		String s="hai how are you HAI";
		c.countVowels(s);
	}

	private void countVowels(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
		   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        {
			System.out.println(s.charAt(i));
		count=count+1;
	    }
		}
		System.out.println("vowels "+count);

}
}
