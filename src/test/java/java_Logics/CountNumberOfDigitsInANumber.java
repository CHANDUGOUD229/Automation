package java_Logics;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args)
	{

		int num=145457474;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number Of Digits In A Number Is ::" +count);
		
		
	}

}
