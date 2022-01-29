package string.workings;

import java.util.Scanner;

public class Revese_a_String {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the String ");
		String s=sc.nextLine();
		String res="";
		Revese_a_String re=new Revese_a_String();
		re.reverse(s,res);
	}

	private void reverse(String s,String res)
	{		
			for(int j=s.length();j>0;j--)
			{
				res=res+s.charAt(j-1);
			}
			System.out.println("Reverse string"+res);
		}
		
	}


