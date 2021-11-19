package java_Logics;

public class SwapString {

	public static void main(String[] args) 
	{

		String a="Ammu";
		String b="lucky";

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		
	}

}
