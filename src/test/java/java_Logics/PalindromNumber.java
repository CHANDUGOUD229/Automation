package java_Logics;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int ss=sc.nextInt();
		int org_num=ss;
		int rev=0;
		while(ss!=0)
		{
			rev=rev*10+ss%10;
			ss=ss/10;
		}
		if(org_num==rev)
		{
			System.out.println(rev +":: This Is polindromNumber");
		}else
		{
			System.out.println(rev +": this is not a polindromNumber ");
		}
		
		
		
	}

}
