package java_Logics;

public class FindLargestNumber {

	public static void main(String[] args)
	{
		//1st Method
		int a=1050,b=2585,c=600;
		//int largest=c>(a>b?a:b)?c:(a>b?a:b);
		//System.out.println(largest);
		//2nd Method
		if(a>c&&a>b)
		{
			System.out.println(a + "  is The LargestNumber");
		}else if(b>a&&b>c)
		{
			System.out.println(b+" is the LargestNumber");
		}else
		{
			System.out.println(c+" is the LargestNumber");
		}
	}

}
