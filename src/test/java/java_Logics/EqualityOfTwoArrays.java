package java_Logics;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args)
	{
		int a1[]={1,2,3,4,5,6,7};
		int a2[]={1,2,3,4,5,6,7};
	boolean status=Arrays.equals(a1, a2);
	if(status==true)
	{
		System.out.println("Arrays Are equals");
	}
	else
	{
		System.out.println("Arrays Are Not Equals");
	}
	
	
	
	
	}

}
