package java_Logics;

public class MissingNumbersInArray {

	public static void main(String[] args) 
	{

		int a[]={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,17,19,20};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		
		System.out.println();
		int sum1=0;
		
		for(int i=1;i<=20;i++)
		{
			sum1=sum1+i;
		}
		System.out.println("Missing Number is :: "+(sum1-sum));
	}

}
