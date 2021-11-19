package java_Logics;

public class CountAdd_EvenDigitsInANumbers {

	public static void main(String[] args) 
	{

		int num=222222;
		int add_count=0;
		int even_count=0;
		
		while(num!=0)
		{
			int rem=num/10;
			if(rem%2==0)
			{
				even_count++;
			}else
			{
				add_count++;
			}
			num=num/10;
		}
		System.out.println(add_count+" "+even_count);
	}

}
