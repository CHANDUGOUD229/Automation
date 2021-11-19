package java_Logics;

public class SumOfElementsInArray {

	public static void main(String[] args)
	{

		int str[]={1,2,3,100,2000};
		
		int sum=0;
		for(int i=0;i<=str.length-1;i++)
		{
			sum=sum+str[i];
		}
		System.out.println(sum);
		
		
	}

}
