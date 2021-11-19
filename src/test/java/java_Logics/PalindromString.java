package java_Logics;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) 
	{

		String str="madam";
		String org_string=str;
		String rev="";
		int length=str.length()-1;
		
	for(int i=length;i>=0;i--)
	{
		rev=rev+str.charAt(i);
				
	}		
	if(org_string.equals(rev))
	{
		System.out.println(rev + ":: Its PolindromString");
		
	}else
	{
			System.out.println(rev +":: Its Not polidrom String");
	}
		
		
		
//		
//		//Throw Scanner
//		Scanner ss=new Scanner(System.in);
//		
//		System.out.println("Enter String Value");
//		
//		String scr=ss.next();
//		
//		String org_value=scr;
//		
//		String reverse="";
//		
//		int len=scr.length()-1;
//		
//		for(int i=len;i>=0;i--)
//		{
//			reverse=reverse+scr.charAt(i);
//		}
//		if(org_value.equals(reverse))
//		{
//			System.out.println(reverse + "   This is Polindrom String ");
//		}else
//		{
//			System.out.println(reverse + "   This is not"
//					+ " Polindrom String");
//		}
//		
		
		
		
	}

}
