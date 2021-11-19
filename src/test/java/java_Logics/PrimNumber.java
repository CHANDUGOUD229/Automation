package java_Logics;

public class PrimNumber {

	public static void main(String[] args) 
	{

		
		int num=6;
		int count=0;
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("primeNumber");
			}else
			{
				System.out.println("Not primne Number");
			}
		}
		
	}

}
