package string.workings;

public class Word_count {

	public static void main(String[] args) {
		String s="hai how are you";
		 int count = 0;
	      for (int i = 0; i < s.length(); i++)
	      {
	        if (s.charAt(i) == ' ')
	          count++;
	      }
	      System.out.println((count + 1)+" Words in this sentence ");
	    boolean res=s.endsWith("you");
	    System.out.println(res);
	    

	}

}
